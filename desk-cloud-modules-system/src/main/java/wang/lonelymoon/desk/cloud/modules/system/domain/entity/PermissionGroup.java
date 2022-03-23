package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

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
