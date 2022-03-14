package wang.lonelymoon.desk.cloud.common.enums;

/**
 * 登录账号类型
 *
 * @author lonelymoon
 */
public enum LoginAccountTypeEnum {
    /**
     * ADMIN 管理员 NORMAL 普通用户
     */
    ADMIN(1, "管理员"), NORMAL(2, "普通用户");


    private Integer code;
    private String desc;

    LoginAccountTypeEnum() {
    }

    LoginAccountTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "LoginAccountTypeEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
