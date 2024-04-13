package org.lshq.components.data.enums;

/**
 * 接口id枚举
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public enum InterfaceIdEnum {
    /**
     * 患者基本信息
     */
    BASE_PATIENT_INFO("BASE_PATIENT_INFO"),
    /**
     * 门诊就诊记录
     */
    BASE_OUTPATIENT_VISIT("BASE_OUTPATIENT_VISIT"),

    // TODO 待添加所有接口
    ;


    /**
     * 接口id
     */
    private String interfaceId;
    InterfaceIdEnum(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getInterfaceId() {
        return interfaceId;
    }
}
