package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wang.lonelymoon.desk.cloud.common.enums.SexEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户信息表
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
    private Integer userType;
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
    private Integer status;
    /**
     * 用户是否删除
     */
    private Integer delFlag;
    /**
     * 用户性别
     */
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(name = "sex")
    private SexEnum sex;

    public User(SexEnum sex) {
        this.sex = sex;
    }
}
