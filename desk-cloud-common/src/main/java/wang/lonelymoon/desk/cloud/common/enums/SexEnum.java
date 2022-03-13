package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */

public enum SexEnum {
    /**
     * MAN 男 WOMAN 女 UNKNOWN 未知
     */
    MAN(1,"男"),WOMAN(2,"女"),UNKNOWN(3,"未知");

    private Integer code;
    private String desc;

    SexEnum() {
    }

    SexEnum(Integer code, String desc) {
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
        return "SexEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
