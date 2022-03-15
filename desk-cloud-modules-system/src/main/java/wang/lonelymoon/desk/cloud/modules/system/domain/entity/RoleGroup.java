package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

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
