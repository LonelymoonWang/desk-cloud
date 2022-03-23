package wang.lonelymoon.desk.cloud.auth.api.request;

public record SendCodeReq(
        String phone,
        String code
) {
}
