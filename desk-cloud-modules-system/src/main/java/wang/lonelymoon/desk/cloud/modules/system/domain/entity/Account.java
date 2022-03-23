package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.Data;
import wang.lonelymoon.desk.cloud.common.enums.LoginAccountStateEnum;
import wang.lonelymoon.desk.cloud.common.enums.LoginAccountStatusEnum;
import wang.lonelymoon.desk.cloud.common.enums.LoginAccountTypeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;

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
     * 登录密码
     */
    private String password;

    /**
     * 账户类型 指该账户具体能做什么
     */
    @Enumerated(value = STRING)
    private LoginAccountTypeEnum loginAccountType;

    /**
     * 账户来源 指该注册账户的源头
     */
    @Enumerated(value = STRING)
    private LoginAccountStateEnum loginAccountState;

    /**
     * 账户状态 指该账户目前的状态
     */
    @Enumerated(value = STRING)
    private LoginAccountStatusEnum status;

}
