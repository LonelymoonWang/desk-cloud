package wang.lonelymoon.desk.cloud.modules.system.manager.service;

import org.springframework.stereotype.Service;
import wang.lonelymoon.desk.cloud.common.service.BaseService;
import wang.lonelymoon.desk.cloud.modules.system.domain.dao.AccountDao;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.Account;
import wang.lonelymoon.desk.cloud.modules.system.manager.request.LoginRequest;
import wang.lonelymoon.desk.cloud.modules.system.manager.response.LoginResponse;

import java.util.Optional;

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
