package org.lshq.components.data.access.inspection.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseInspectionExam implements Serializable {
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
     * 报告 ID
     */
    private String reportId;

    /**
     * 就诊类型
     */
    private String visitType;

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
     * 就诊科室编码
     */
    private String visitDeptCode;

    /**
     * 就诊科室名称
     */
    private String visitDeptName;

    /**
     * 床位号
     */
    private String bedNo;

    /**
     * 住院科室代码
     */
    private String deptCode;

    /**
     * 住院科室名称
     */
    private String deptName;

    /**
     * 医嘱ID
     */
    private String orderId;

    /**
     * 检查类别
     */
    private String examClass;

    /**
     * 检查项目代码
     */
    private String examClinicCode;

    /**
     * 检查项目名称
     */
    private String examClinicName;

    /**
     * 诊断代码
     */
    private String diagnosisCode;

    /**
     * 诊断名称
     */
    private String diagnosisName;

    /**
     * 报告标题
     */
    private String reportTitle;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 申请科室编码
     */
    private String applyDeptCode;

    /**
     * 申请科室名称
     */
    private String applyDeptName;

    /**
     * 申请人代码
     */
    private String applyDoctorCode;

    /**
     * 申请人姓名
     */
    private String applyDoctorName;

    /**
     * 审核人编码
     */
    private String examDoctorCode;

    /**
     * 审核人姓名
     */
    private String examDoctorName;

    /**
     * 样本编码
     */
    private String testSamplyCode;

    /**
     * 样本名称
     */
    private String testSamplyName;

    /**
     * 采集人代码
     */
    private String collectionDoctorCode;

    /**
     * 采集人姓名
     */
    private String collectionDoctorName;

    /**
     * 检验科室编码
     */
    private String examDeptCode;

    /**
     * 检验科室名称
     */
    private String examDeptName;

    /**
     * 检验医师编码
     */
    private String testDoctorCode;

    /**
     * 检验医师姓名
     */
    private String testDoctorName;

    /**
     * 报告时间
     */
    private Date testName;

    /**
     * 报告内容
     */
    private String reportContent;

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