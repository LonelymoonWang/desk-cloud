package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.RoleGroup;

public interface RoleGroupDao extends JpaRepository<RoleGroup, Long> {
}
