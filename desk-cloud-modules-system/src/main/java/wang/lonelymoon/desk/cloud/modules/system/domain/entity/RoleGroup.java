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
@Entity(name = "system_role_group")
public class RoleGroup {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String roleGroupName;

    private Long orderNum;

    private String roleIds;

    private String accountIds;
}
