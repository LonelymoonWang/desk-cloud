package wang.lonelymoon.desk.cloud.auth.api;

import org.springframework.web.bind.annotation.*;
import wang.lonelymoon.desk.cloud.auth.manager.feign.*;
import wang.lonelymoon.desk.cloud.common.api.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.request.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.response.*;
import wang.lonelymoon.desk.cloud.common.result.*;

/**
 * @author lonelymoon
 */
@RestController
public class LoginApi implements BaseApi<LoginApiRequest, LoginApiResponse> {


    private final LoginFeign loginFeign;

    public LoginApi(LoginFeign loginFeign) {
        this.loginFeign = loginFeign;
    }

    @Override
    @PostMapping("login")
    public ResponseResult<LoginApiResponse> execute(@RequestBody LoginApiRequest loginApiRequest) {
        return loginFeign.execute(loginApiRequest);
    }

    @GetMapping(value = "/oauth2/callback",headers = "")
    public String callback(@RequestParam("code") String code) {
        return code;
    }
}
