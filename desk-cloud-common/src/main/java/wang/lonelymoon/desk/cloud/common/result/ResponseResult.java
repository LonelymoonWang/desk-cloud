package wang.lonelymoon.desk.cloud.common.result;

import java.util.HashMap;

/**
 * @author lonelymoon
 */
public class ResponseResult<T> extends HashMap<String, Object> {

    public ResponseResult<T> re(Integer code, String message, Boolean isOk, T t) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.put("code", code);
        responseResult.put("message", message);
        responseResult.put("isOk", isOk);
        responseResult.put("data", t);
        return responseResult;
    }

    public ResponseResult<T> success(T t) {
        return re(200, "操作成功", true, t);
    }

    public ResponseResult<T> success(String message) {
        return re(200, message, true, null);
    }

    public ResponseResult<T> success(String message, T t) {
        return re(200, message, true, t);
    }

    public ResponseResult<T> fail(String message) {
        return re(500, message, false, null);
    }

    public ResponseResult<T> fail(Integer code, String message) {
        return re(code, message, false, null);
    }

}
