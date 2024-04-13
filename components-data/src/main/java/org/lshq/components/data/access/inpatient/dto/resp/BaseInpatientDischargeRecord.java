package org.lshq.components.data.access.inpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseInpatientDischargeRecord implements Serializable {
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
     * 住院次数
     */
    private String inHospitalNo;

    /**
     * 入院时间
     */
    private Date inTime;

    /**
     * 出院时间
     */
    private Date outTime;

    /**
     * 住院天数
     */
    private String inDays;

    /**
     * 住院状态
     */
    private String inState;

    /**
     * 入院情况
     */
    private String inSituation;

    /**
     * 入院诊断
     */
    private String inDiagnosis;

    /**
     * 出院情况
     */
    private String outSituation;

    /**
     * 出院诊断
     */
    private String outDiagnosis;

    /**
     * 主管医生编码
     */
    private String chargeDoctorCode;

    /**
     * 主管医生姓名
     */
    private String chargeDoctorName;

    /**
     * 主任医生编码
     */
    private String professorCode;

    /**
     * 主任医生姓名
     */
    private String professorName;

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
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}