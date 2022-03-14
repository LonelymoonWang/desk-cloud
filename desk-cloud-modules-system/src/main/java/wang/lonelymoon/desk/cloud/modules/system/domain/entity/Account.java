package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.*;
import wang.lonelymoon.desk.cloud.common.enums.*;

import javax.persistence.*;

import static javax.persistence.EnumType.*;

/**
 * 账户表
 *
 * @author lonelymoon
 */
@Data
@Entity(name = "system_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * 登录账户
     */
    private String loginAccount;

    /**
     * 账户类型
     */
    @Enumerated(value = STRING)
    private LoginAccountTypeEnum loginAccountType;

    /**
     * 登录密码
     */
    private String password;
    /**
     * 账户状态
     */
    private Integer status;
}
