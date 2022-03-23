package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.User;

/**
 * @author lonelymoon
 */
public interface UserDao extends JpaRepository<User, Long> {

}
