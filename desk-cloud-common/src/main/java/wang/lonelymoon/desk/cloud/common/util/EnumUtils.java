package wang.lonelymoon.desk.cloud.common.util;

import cn.hutool.core.util.*;

/**
 * @author lonelymoon
 */
public class EnumUtils extends EnumUtil {

    public static <E extends Enum<E>> E code(Class<E> clazz, Integer code) {
        return getFieldValuesWithCode(clazz, "code", code);
    }

    public static <E extends Enum<E>> E desc(Class<E> clazz, String desc) {
        return getFieldValuesWithCode(clazz, "desc", desc);
    }

    public static <E extends Enum<E>> E getFieldValuesWithCode(Class<E> clazz, String fieldName, Object code) {
        final Enum<?>[] enums = clazz.getEnumConstants();
        if (null == enums) {
            return null;
        }
        for (Enum<?> e : enums) {
            Object fieldValue = ReflectUtil.getFieldValue(e, fieldName);
            if (fieldValue.equals(code)) {
                return fromString(clazz, e.name());
            }
        }
        throw new RuntimeException("参数不正确");
    }
}
