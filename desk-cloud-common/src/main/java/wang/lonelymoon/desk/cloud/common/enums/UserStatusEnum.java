package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */
public enum UserStatusEnum {

    /**
     * USING 使用中
     */
    USING(1,"使用中"),DISABLE(2,"停用");

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

    UserStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    UserStatusEnum() {
    }

    @Override
    public String toString() {
        return "UserStatusEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
