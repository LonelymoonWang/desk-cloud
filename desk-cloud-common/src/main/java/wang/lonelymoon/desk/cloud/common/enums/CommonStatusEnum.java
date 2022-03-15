package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */

public enum CommonStatusEnum {
    /**
     * USING 使用中
     */
    USING(1, "使用中"), DISABLE(2, "停用");

    private Integer code;
    private String desc;

    CommonStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    CommonStatusEnum() {
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
        return "CommonStatusEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
