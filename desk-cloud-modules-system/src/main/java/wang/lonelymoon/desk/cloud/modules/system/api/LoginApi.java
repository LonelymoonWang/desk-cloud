package wang.lonelymoon.desk.cloud.modules.system.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wang.lonelymoon.desk.cloud.common.api.BaseApi;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.request.LoginApiRequest;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.response.LoginApiResponse;
import wang.lonelymoon.desk.cloud.common.enums.LoginAccountTypeEnum;
import wang.lonelymoon.desk.cloud.common.result.ResponseResult;
import wang.lonelymoon.desk.cloud.modules.system.manager.request.LoginRequest;
import wang.lonelymoon.desk.cloud.modules.system.manager.response.LoginResponse;
import wang.lonelymoon.desk.cloud.modules.system.manager.service.LoginServiceImpl;

import static wang.lonelymoon.desk.cloud.common.util.EnumUtils.code;


/**
 * @author lonelymoon
 */
@RestController
public class LoginApi implements BaseApi<LoginApiRequest, LoginApiResponse> {

    private final LoginServiceImpl loginService;

    public LoginApi(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @Override
    @PostMapping("login")
    public ResponseResult<LoginApiResponse> execute(@RequestBody LoginApiRequest loginApiRequest) {
        LoginResponse response = loginService.execute(new LoginRequest(
                loginApiRequest.username()
                , loginApiRequest.password()
                , code(LoginAccountTypeEnum.class, loginApiRequest.loginAccountType())
        ));
        return new ResponseResult<LoginApiResponse>().success(new LoginApiResponse(response.id()));
    }
}
