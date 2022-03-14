package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */

public enum UserTypeEnum {
    /**
     * NORMAL 普通
     */
    NORMAL(1,"普通");


    private Integer code;
    private String desc;

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


    UserTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    UserTypeEnum() {
    }

    @Override
    public String toString() {
        return "UserTypeEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
