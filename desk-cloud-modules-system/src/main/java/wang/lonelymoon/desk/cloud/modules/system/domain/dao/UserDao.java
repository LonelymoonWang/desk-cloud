package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.repository.*;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.*;

/**
 * @author lonelymoon
 */
public interface UserDao extends CrudRepository<User, Long> {

}
