package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
