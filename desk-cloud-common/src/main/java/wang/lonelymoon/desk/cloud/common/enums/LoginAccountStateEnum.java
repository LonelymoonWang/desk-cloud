package wang.lonelymoon.desk.cloud.common.enums;

/**
 * 登录账户的来源
 * @author lonelymoon
 */
public enum LoginAccountStateEnum {
    /**
     * SYSTEM 系统
     */
    SYSTEM(1,"系统");
    private Integer code;
    private String desc;

    LoginAccountStateEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    LoginAccountStateEnum() {
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
        return "LoginAccountStateEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
