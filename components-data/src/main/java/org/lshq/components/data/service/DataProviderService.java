package org.lshq.components.data.service;

import org.lshq.components.data.access.patient.service.PatientProviderService;
import org.lshq.components.data.enums.HospitalAgreementEnum;
import org.lshq.components.data.enums.BusinessEnum;

/**
 * 数据提供服务
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public interface DataProviderService extends PatientProviderService {

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
