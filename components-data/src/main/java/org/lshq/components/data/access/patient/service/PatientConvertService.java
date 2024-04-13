package org.lshq.components.data.access.patient.service;

import org.lshq.components.data.access.patient.dto.req.BasePatientInfoReq;
import org.lshq.components.data.access.patient.dto.resp.BasePatientDiagResp;
import org.lshq.components.data.dto.BaseResp;

import java.util.List;

/**
 * 患者信息-转换服务
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public interface PatientConvertService {
    /**
     * 获取基础患者信息列表
     *
     * @param object 对象
     * @return {@link BaseResp }<{@link List }<{@link BasePatientInfoReq }>>
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    default BaseResp<List<BasePatientInfoReq>> getBasePatientInfoList(Object object) {
        return null;
    }

    /**
     * 获取基本患者诊断列表
     *
     * @param object 对象
     * @return {@link BaseResp }<{@link List }<{@link BasePatientDiagResp }>>
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    default BaseResp<List<BasePatientDiagResp>> getBasePatientDiagList(Object object) {
        return null;
    }
}
