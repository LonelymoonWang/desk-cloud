package wang.lonelymoon.desk.cloud.common.api;

import wang.lonelymoon.desk.cloud.common.result.ResponseResult;

/**
 * @author lonelymoon
 */
public interface BaseApi<ApiRequest, ApiResponse> {

    /**
     * api 基础类
     *
     * @param apiRequest api的请求类
     * @return api的返回
     */
    ResponseResult<ApiResponse> execute(ApiRequest apiRequest);

}
