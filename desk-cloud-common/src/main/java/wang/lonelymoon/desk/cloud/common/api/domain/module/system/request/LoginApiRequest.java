package wang.lonelymoon.desk.cloud.common.api.domain.module.system.request;

public record LoginApiRequest(
        String username,
        String password,
        Integer loginAccountType
) {
}
