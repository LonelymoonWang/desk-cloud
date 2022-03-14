package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.repository.*;
import org.springframework.lang.*;
import wang.lonelymoon.desk.cloud.common.enums.*;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.*;

import java.util.*;

/**
 * @author lonelymoon
 */
public interface AccountDao extends CrudRepository<Account, Long> {
    /**
     * 查询账户信息
     * @param loginAccount 登录账号
     * @param loginAccountType 账号类型
     * @param password 密码
     * @return Optional.Account
     */
    Optional<Account> findByLoginAccountEqualsAndLoginAccountTypeEqualsAndPasswordEquals(@NonNull String loginAccount, @NonNull LoginAccountTypeEnum loginAccountType, @NonNull String password);
}
