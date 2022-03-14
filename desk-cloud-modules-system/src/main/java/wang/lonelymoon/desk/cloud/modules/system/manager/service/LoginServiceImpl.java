package wang.lonelymoon.desk.cloud.modules.system.manager.service;

import org.springframework.stereotype.*;
import wang.lonelymoon.desk.cloud.common.service.*;
import wang.lonelymoon.desk.cloud.modules.system.domain.dao.*;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.*;
import wang.lonelymoon.desk.cloud.modules.system.manager.request.*;
import wang.lonelymoon.desk.cloud.modules.system.manager.response.*;

import java.util.*;

/**
 * @author lonelymoon
 */
@Service(value = "loginService")
public class LoginServiceImpl implements BaseService<LoginRequest, LoginResponse> {

    private final AccountDao accountDao;

    public LoginServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public LoginResponse execute(LoginRequest loginRequest) {
        Optional<Account> account = accountDao.findByLoginAccountEqualsAndLoginAccountTypeEqualsAndPasswordEquals(
                loginRequest.username()
                , loginRequest.loginAccountType()
                , loginRequest.password());
        if (account.isPresent()) {
            return new LoginResponse(account.get().getId());
        }
        throw new RuntimeException("未找到该用户");
    }
}
