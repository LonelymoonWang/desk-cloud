package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.repository.CrudRepository;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.User;

/**
 * @author lonelymoon
 */
public interface UserDao extends CrudRepository<User,Long> {
}
