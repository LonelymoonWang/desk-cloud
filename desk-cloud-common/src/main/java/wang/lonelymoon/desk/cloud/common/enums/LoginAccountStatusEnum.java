package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */

public enum LoginAccountStatusEnum {
    /**
     * NORMAL 正常 LOCKED 封禁
     */
    NORMAL(1, "正常"), LOCKED(2, "封禁");

    private Integer code;
    private String desc;

    LoginAccountStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    LoginAccountStatusEnum() {
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
        return "LoginAccountStatusEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
