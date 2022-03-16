package wang.lonelymoon.desk.cloud.modules.system.domain.dao;

import org.springframework.data.jpa.repository.*;
import wang.lonelymoon.desk.cloud.modules.system.domain.entity.*;

public interface PermissionGroupDao extends JpaRepository<PermissionGroup, Long> {
}
