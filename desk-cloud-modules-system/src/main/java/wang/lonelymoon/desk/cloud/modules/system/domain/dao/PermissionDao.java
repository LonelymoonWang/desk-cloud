package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
}
