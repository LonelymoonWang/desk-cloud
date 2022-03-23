package wang.lonelymoon.desk.cloud.common.api.domain.auth.server.request;

public record RegistryRequest(
        String username,
        String password,
        Integer registryType
) {
}
