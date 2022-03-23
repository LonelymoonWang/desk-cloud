package wang.lonelymoon.desk.cloud.auth.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.lonelymoon.desk.cloud.auth.api.request.RegistryReq;
import wang.lonelymoon.desk.cloud.auth.api.response.RegistryRes;
import wang.lonelymoon.desk.cloud.common.api.BaseApi;
import wang.lonelymoon.desk.cloud.common.result.ResponseResult;

/**
 * 注册api
 *
 * @author lonelymoon
 */
@RestController
@RequestMapping("registry")
public class RegistryApi implements BaseApi<RegistryReq, RegistryRes> {
    @Override
    @RequestMapping("execute")
    public ResponseResult<RegistryRes> execute(RegistryReq registryReq) {
        return null;
    }
}
