package wang.lonelymoon.desk.cloud.auth.api.request;

public record RegistryReq(
        String username,
        String password,
        String phone,
        String code,
        String uuid
) {
}
