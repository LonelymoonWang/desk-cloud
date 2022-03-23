package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.Data;
import wang.lonelymoon.desk.cloud.common.enums.CommonStatusEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

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
    @Enumerated(value = STRING)
    private CommonStatusEnum status;


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
