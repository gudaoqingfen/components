package org.lshq.components.data.access.outpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseOutpatientVisit implements Serializable {
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
     * 挂号类型代码
     */
    private String registerTypeCode;

    /**
     * 挂号类型名称
     */
    private String registerTypeName;

    /**
     * 就诊状态名称
     */
    private String visitStatusName;

    /**
     * 就诊医生工号
     */
    private String visitDoctorCode;

    /**
     * 就诊医生姓名
     */
    private String visitDoctorName;

    /**
     * 就诊科室编码
     */
    private String visitDeptCode;

    /**
     * 就诊科室名称
     */
    private String visitDeptName;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 患者联系方式手机号码
     */
    private String phone;

    /**
     * 就诊时间
     */
    private Date visitTime;

    /**
     * 主诊断代码
     */
    private String diagnosisCode;

    /**
     * 诊断代码1
     */
    private String diagnosisSubCodeI;

    /**
     * 诊断名称1
     */
    private String diagnosisSubNameI;

    /**
     * 诊断代码2
     */
    private String diagnosisSubCodeIi;

    /**
     * 诊断名称2
     */
    private String diagnosisSubNameIi;

    /**
     * 诊断代码3
     */
    private String diagnosisSubCodeIii;

    /**
     * 诊断名称3
     */
    private String diagnosisSubNameIii;

    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

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