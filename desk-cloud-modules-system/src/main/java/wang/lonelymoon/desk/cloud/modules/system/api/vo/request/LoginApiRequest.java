package wang.lonelymoon.desk.cloud.modules.system.api.vo.request;

public record LoginApiRequest(
        String username,
        String password,
        Integer loginAccountType
) {
}
