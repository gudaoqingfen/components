package org.lshq.components.data.service;

import org.lshq.components.data.access.patient.service.PatientConvertService;
import org.lshq.components.data.enums.BusinessEnum;
import org.lshq.components.data.enums.HospitalAgreementEnum;

/**
 * 数据转换服务
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public interface DataConvertService extends PatientConvertService {


    /**
     * 医院协议
     *
     * @return {@link HospitalAgreementEnum }
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    HospitalAgreementEnum hospitalAgreement();

    /**
     * 场景标识码，默认慢病
     *
     * @return {@link BusinessEnum }
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    default BusinessEnum businessCode() {
        return BusinessEnum.CHRONIC;
    }
}
