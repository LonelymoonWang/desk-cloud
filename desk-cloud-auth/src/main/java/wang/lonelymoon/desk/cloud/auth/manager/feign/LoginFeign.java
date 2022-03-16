package wang.lonelymoon.desk.cloud.auth.manager.feign;

import org.springframework.cloud.openfeign.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.request.*;
import wang.lonelymoon.desk.cloud.common.api.domain.module.system.response.*;
import wang.lonelymoon.desk.cloud.common.result.*;

/**
 * Component 添加为容器内的一个组件
 * FeignClient 服务提供者提供的服务名称，即 application.name
 *
 * @author lonelymoon
 */
@Component
@FeignClient(value = "desk-cloud-modules-system")
public interface LoginFeign {
    /**
     * desk-cloud-modules-system login
     *
     * @param loginApiRequest 登录请求
     * @return ResponseResult
     */
    @PostMapping(value = "login", consumes = "application/json")
    ResponseResult<LoginApiResponse> execute(LoginApiRequest loginApiRequest);
}
