package org.lshq.components.data.enums;

/**
 * 医院协议枚举
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public enum HospitalAgreementEnum {
    /**
     * 基本xml
     */
    BASE_XML("BASE_XML","基础XML协议"),
    /**
     * 基本json
     */
    BASE_JSON("BASE_XML","基础JSON协议")

    ;

    private String code;
    private String value;

    HospitalAgreementEnum(String code, String value) {
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
        for (HospitalAgreementEnum hospitalAgreementEnum : HospitalAgreementEnum.values()) {
            if (hospitalAgreementEnum.getCode().equals(code)) {
                return hospitalAgreementEnum.getValue();
            }
        }
        return "";
    }

    public static HospitalAgreementEnum hospitalAgreementEnum(String code) {
        for (HospitalAgreementEnum hospitalAgreementEnum : HospitalAgreementEnum.values()) {
            if (hospitalAgreementEnum.getCode().equals(code)) {
                return hospitalAgreementEnum;
            }
        }
        return HospitalAgreementEnum.BASE_XML;
    }
}
