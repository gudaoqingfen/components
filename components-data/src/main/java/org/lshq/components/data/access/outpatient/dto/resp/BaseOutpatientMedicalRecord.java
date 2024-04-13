package org.lshq.components.data.access.outpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseOutpatientMedicalRecord implements Serializable {
    /**
     * 唯一标识 uuid_chort
     */
    private Long id;

    /**
     * 租户号
     */
    private Long tenantCode;

    /**
     * 机构编码
     */
    private String orgCode;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 患者ID
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
     * 主诉
     */
    private String mainSymptom;

    /**
     * 现病史
     */
    private String nowIiness;

    /**
     * 既往史
     */
    private String historyIiness;

    /**
     * 过敏史
     */
    private String allergyHistory;

    /**
     * 个人史
     */
    private String personIiness;

    /**
     * 月经史
     */
    private String mensesHistory;

    /**
     * 传染病史
     */
    private String infectionHistory;

    /**
     * 婚育史
     */
    private String maritalHistory;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 体格检查
     */
    private String healthChecks;

    /**
     * 建议
     */
    private String healthAdvice;

    /**
     * 诊断
     */
    private String diagnosis;

    /**
     * 评估时间
     */
    private Date assessmentTime;

    /**
     * 最后更新时间
     */
    private Date lastUpddateTime;

    /**
     * 是否删除 1=软删除 0 未删除
     */
    private Boolean deleteFlag;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}