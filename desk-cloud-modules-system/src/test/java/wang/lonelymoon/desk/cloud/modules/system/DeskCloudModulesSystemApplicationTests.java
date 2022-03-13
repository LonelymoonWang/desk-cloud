package wang.lonelymoon.desk.cloud.modules.system;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import wang.lonelymoon.desk.cloud.common.enums.SexEnum;
import wang.lonelymoon.desk.cloud.modules.system.domain.dao.UserDao;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.User;

import javax.annotation.Resource;

@SpringBootTest
class DeskCloudModulesSystemApplicationTests {

    @Resource
    private UserDao userDao;

    @Test
    void contextLoads() {
        User user = userDao.save(new User(SexEnum.MAN));
        System.out.println(user);
        System.out.println(user.getSex());
    }

}
