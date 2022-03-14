package wang.lonelymoon.desk.cloud.common.enums;


/**
 * @author lonelymoon
 */
public enum DelFlagEnum {
    /**
     * DEL 删除 NOT_DEL 未删除
     */
    DEL(0,"删除"),NOT_DEL(1,"未删除");

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

    DelFlagEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    DelFlagEnum() {
    }

    @Override
    public String toString() {
        return "DelFlagEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
