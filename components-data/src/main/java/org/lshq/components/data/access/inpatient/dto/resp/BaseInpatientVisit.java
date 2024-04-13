package org.lshq.components.data.access.inpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseInpatientVisit implements Serializable {
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
     * 主诊断代码
     */
    private String mainDiagnosisCode;

    /**
     * 主诊断名称
     */
    private String mainDiagnosisName;

    /**
     * 副诊断代码
     */
    private String diagnosisCode;

    /**
     * 副诊断名称
     */
    private String diagnosisName;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 患者联系方式手机号
     */
    private String phone;

    /**
     * 床位号
     */
    private String bedNo;

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
     * 住院次数
     */
    private String inHospitalNo;

    /**
     * 住院状态
     */
    private String inState;

    /**
     * 入院病区代码
     */
    private String adminWardCode;

    /**
     * 入院病区名称
     */
    private String adminWardName;

    /**
     * 入院科室代码
     */
    private String adminDeptCode;

    /**
     * 入院科室名称
     */
    private String adminDeptName;

    /**
     * 住院病区代码
     */
    private String wardCode;

    /**
     * 住院病区名称
     */
    private String wardName;

    /**
     * 住院科室代码
     */
    private String deptCode;

    /**
     * 住院科室名称
     */
    private String deptName;

    /**
     * 主管护士编码
     */
    private String chargeNurseCode;

    /**
     * 主管护士姓名
     */
    private String chargeNurseName;

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
     * 联系人
     */
    private String relatePerson;

    /**
     * 联系人关系编码
     */
    private String relationCode;

    /**
     * 联系人关系
     */
    private String relation;

    /**
     * 联系人电话
     */
    private String relatePhone;

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