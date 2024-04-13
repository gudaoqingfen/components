package org.lshq.components.data.access.patient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.lshq.components.data.dto.ExternalResp;

/**
 * 基础患者诊断信息
 * 凡标注标准字段，不可随意更改需随接口文档同步修改
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
@Data
public class BasePatientDiagResp extends ExternalResp implements Serializable{

    /**
     * 流水号
     * 标准字段
     */
    private String serialNo;

    /**
     * 患者ID
     * 标准字段
     */
    private String patientId;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 就诊类型
     */
    private String visitType;

    /**
     * 诊断记录ID
     */
    private String diagnosisId;

    /**
     * 疾病代码
     */
    private String diagnosisCode;

    /**
     * 疾病名称
     */
    private String diagnosisName;

    /**
     * 诊断医生代码
     */
    private String diagnosisDoctorCode;

    /**
     * 诊断医生描述
     */
    private String diagnosisDoctorDesc;

    /**
     * 诊断来源代码
     */
    private String diagnosisSourceCode;

    /**
     * 诊断来源
     */
    private String diagnosisSourceName;

    /**
     * 诊断类型代码
     */
    private String diagnosisTypeCode;

    /**
     * 诊断类型
     */
    private String diagnosisTypeName;

    /**
     * 诊断类别代码
     */
    private String diagnosisCategoryCode;

    /**
     * 诊断类别
     */
    private String diagnosisCategoryName;

    /**
     * 最后更新时间
     */
    private Date lastUpddateTime;

    private static final long serialVersionUID = 1L;
}