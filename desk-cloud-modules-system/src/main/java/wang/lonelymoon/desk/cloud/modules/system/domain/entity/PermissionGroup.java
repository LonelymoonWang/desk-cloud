package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

/**
 * @author lonelymoon
 */
@Data
@Entity(name = "system_permission_group")
public class PermissionGroup {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 权限组名称
     */
    private String permissionGroupName;

    /**
     * 排序
     */
    private Long orderNum;

    /**
     * 权限ids
     */
    private String permissionIds;

    /**
     * 角色id，逗号隔开
     */
    private String roleIds;
}
