package wang.lonelymoon.desk.cloud.auth.api.request;

public record LoginReq(
        String username,
        String password,
        String uuid
) {
}
