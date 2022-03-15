package wang.lonelymoon.desk.cloud.modules.system.api;

import org.springframework.web.bind.annotation.*;
import wang.lonelymoon.desk.cloud.common.api.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.request.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.response.*;
import wang.lonelymoon.desk.cloud.common.enums.*;
import wang.lonelymoon.desk.cloud.common.result.*;
import wang.lonelymoon.desk.cloud.modules.system.manager.request.*;
import wang.lonelymoon.desk.cloud.modules.system.manager.response.*;
import wang.lonelymoon.desk.cloud.modules.system.manager.service.*;

import static wang.lonelymoon.desk.cloud.common.util.EnumUtils.*;


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
