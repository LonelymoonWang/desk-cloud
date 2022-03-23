package wang.lonelymoon.desk.cloud.common.enums;

public enum RegistryTypeEnum {
    /**
     * PASSWORD 密码 EMAIL 邮箱 MOBILE 手机号
     */
    PASSWORD(1, "密码"), EMAIL(2, "邮箱"), MOBILE(3, "手机号");

    private Integer code;
    private String desc;

    RegistryTypeEnum() {
    }

    RegistryTypeEnum(Integer code, String desc) {
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
