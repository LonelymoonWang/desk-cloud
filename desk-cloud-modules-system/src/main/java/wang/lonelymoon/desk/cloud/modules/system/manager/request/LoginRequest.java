package wang.lonelymoon.desk.cloud.modules.system.manager.request;

import wang.lonelymoon.desk.cloud.common.enums.*;

public record LoginRequest(
        String username,
        String password,
        LoginAccountTypeEnum loginAccountType
) {
}
