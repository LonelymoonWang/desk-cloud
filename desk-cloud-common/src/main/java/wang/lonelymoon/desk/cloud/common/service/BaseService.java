package wang.lonelymoon.desk.cloud.common.service;

/**
 * @author lonelymoon
 */
public interface BaseService<Request, Response> {

    /**
     * 执行service处理逻辑
     *
     * @param request 请求service的实体类
     * @return Response
     */
    Response execute(Request request);

}
