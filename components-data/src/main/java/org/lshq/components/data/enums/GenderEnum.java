package org.lshq.components.data.enums;

/**
 * 性别枚举
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public enum GenderEnum {
    /**
     * 男
     */
    MALE("1","男"),
    /**
     * 女
     */
    FEMALE("2","女"),
    /**
     * 未知
     */
    UNKNOWN("0","未知"),
    ;


    private String code;
    private String value;

    GenderEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(String code) {
        for (GenderEnum genderEnum : GenderEnum.values()) {
            if (genderEnum.getCode().equals(code)) {
                return genderEnum.getValue();
            }
        }
        return "";
    }

    public static GenderEnum getGenderEnum(String code) {
        for (GenderEnum genderEnum : GenderEnum.values()) {
            if (genderEnum.getCode().equals(code)) {
                return genderEnum;
            }
        }
        return GenderEnum.MALE;
    }
}
