package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wang.lonelymoon.desk.cloud.common.enums.DelFlagEnum;
import wang.lonelymoon.desk.cloud.common.enums.SexEnum;
import wang.lonelymoon.desk.cloud.common.enums.UserStatusEnum;
import wang.lonelymoon.desk.cloud.common.enums.UserTypeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;

/**
 * 用户信息表
 *
 * @author lonelymoon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "system_user")
public class User {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    /**
     * 账户id
     */
    private Long accountId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户类型
     */
    @Enumerated(value = STRING)
    private UserTypeEnum userType;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户头像地址
     */
    private String avatarUrl;
    /**
     * 用户状态
     */
    @Enumerated(value = STRING)
    private UserStatusEnum status;
    /**
     * 用户是否删除
     */
    @Enumerated(value = STRING)
    private DelFlagEnum delFlag;
    /**
     * 用户性别
     */
    @Enumerated(value = STRING)
    private SexEnum sex;

    /**
     * 角色id列表，逗号隔开
     */
    private String roleIds;

    /**
     * 角色组ids，逗号隔开
     */
    private String roleGroupIds;

}
