package org.lshq.components.data.access.outpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseOutpatientMedicalAdvice implements Serializable {
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
     * 医嘱ID
     */
    private String orderId;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 医嘱项目类型代码
     */
    private String medicalOrderType;

    /**
     * 医嘱项目类型名称
     */
    private String medicalOrderName;

    /**
     * 医嘱状态代码
     */
    private String orderStatusCode;

    /**
     * 医嘱状态描述
     */
    private String orderStatusName;

    /**
     * 医嘱开嘱时间
     */
    private Date orderCreateTime;

    /**
     * 开嘱医生代码
     */
    private String orderDoctorCode;

    /**
     * 开嘱医生姓名
     */
    private String orderDoctorName;

    /**
     * 开嘱科室编码
     */
    private String orderDeptCode;

    /**
     * 开嘱科室名称
     */
    private String orderDeptName;

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