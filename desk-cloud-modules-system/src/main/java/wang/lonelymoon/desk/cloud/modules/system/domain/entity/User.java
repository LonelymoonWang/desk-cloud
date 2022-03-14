package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.*;
import wang.lonelymoon.desk.cloud.common.enums.*;

import javax.persistence.*;

import static javax.persistence.EnumType.*;

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

    public User(SexEnum sex) {
        this.sex = sex;
    }

    public User(String username) {
        this.username = username;
    }
}
