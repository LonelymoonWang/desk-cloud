package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 账户表
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
    private Integer loginAccountType;

    /**
     * 登录密码
     */
    private String password;
    /**
     * 账户状态
     */
    private Integer status;
}
