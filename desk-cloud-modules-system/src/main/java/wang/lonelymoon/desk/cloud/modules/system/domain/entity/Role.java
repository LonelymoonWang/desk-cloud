package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

/**
 * @author lonelymoon
 */
@Data
@Entity(name = "system_role")
public class Role {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色标识
     */
    private String roleKey;

    /**
     * 排序
     */
    private Integer roleSort;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否删除
     */
    private Integer delFlag;

    /**
     * 账户id，逗号隔开
     */
    private String accountIds;

    /**
     * 角色组id，逗号隔开
     */
    private String roleGroupIds;

    /**
     * 权限id列表，逗号隔开
     */
    private String permissionIds;

    /**
     * 权限组id列表，逗号隔开
     */
    private String permissionGroupIds;
}
