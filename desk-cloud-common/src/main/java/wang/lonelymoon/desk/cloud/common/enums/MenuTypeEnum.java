package wang.lonelymoon.desk.cloud.common.enums;

/**
 * @author lonelymoon
 */

public enum MenuTypeEnum {
    /**
     * 菜单、目录、按钮
     */
    M(1,"菜单"),D(2,"目录"),B(3,"按钮");
    private Integer code;
    private String desc;

    MenuTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    MenuTypeEnum() {
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
        return "MenuTypeEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
