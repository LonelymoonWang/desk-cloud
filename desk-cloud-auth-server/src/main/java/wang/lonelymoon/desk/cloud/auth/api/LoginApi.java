package wang.lonelymoon.desk.cloud.auth.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.lonelymoon.desk.cloud.auth.api.request.LoginReq;
import wang.lonelymoon.desk.cloud.auth.api.response.LoginRes;
import wang.lonelymoon.desk.cloud.common.api.BaseApi;
import wang.lonelymoon.desk.cloud.common.result.ResponseResult;

/**
 * @author lonelymoon
 */
@RestController
public class LoginApi implements BaseApi<LoginReq, LoginRes> {

    @Override
    @RequestMapping("execute")
    public ResponseResult<LoginRes> execute(LoginReq loginReq) {
        return null;
    }
}
