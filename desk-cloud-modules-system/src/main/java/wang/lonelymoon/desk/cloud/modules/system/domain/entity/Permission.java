package wang.lonelymoon.desk.cloud.modules.system.domain.entity;

import lombok.Data;
import wang.lonelymoon.desk.cloud.common.enums.CommonStatusEnum;
import wang.lonelymoon.desk.cloud.common.enums.MenuTypeEnum;

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
@Entity(name = "system_permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 排序
     */
    private Long orderNum;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 路由参数
     */
    private String query;

    /**
     * 是否为外链
     */
    private Boolean isFrame;

    /**
     * 菜单类型（目录、菜单、按钮）
     */
    @Enumerated(value = STRING)
    private MenuTypeEnum menuType;

    /**
     * 菜单显示状态（显示、隐藏）
     */
    private Boolean visible;

    /**
     * 菜单状态（正常、停用）
     */
    @Enumerated(value = STRING)
    private CommonStatusEnum status;

    /**
     * 权限标识
     */
    private String permKey;

    /**
     * 菜单图标
     */
    private String icon;


    /**
     * 角色id，逗号隔开
     */
    private String roleIds;
}
