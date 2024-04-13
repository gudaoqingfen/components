package org.lshq.components.data.access.patient.service;

import org.lshq.components.data.access.patient.dto.req.BasePatientInfoReq;
import org.lshq.components.data.access.patient.dto.resp.BasePatientDiagResp;

/**
 * 患者信息-请求服务
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public interface PatientProviderService {
    /**
     * 获取基础患者信息列表
     *
     * @param basePatientInfoReq 基本患者信息要求
     * @return {@link Object }
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    default Object getBasePatientInfoList(BasePatientInfoReq basePatientInfoReq) {
        return null;
    }

    /**
     * 获取基本患者诊断列表
     *
     * @param basePatientDiagResp 基础患者诊断报告
     * @return {@link Object }
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    default Object getBasePatientDiagList(BasePatientDiagResp basePatientDiagResp) {
        return null;
    }
}
