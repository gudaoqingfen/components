package org.lshq.components.data.access.physical.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BasePhysicalSignRecord implements Serializable {
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
     * 就诊类型
     */
    private String visitType;

    /**
     * 体征记录ID
     */
    private String physicalExamId;

    /**
     * 测量项目CODE
     */
    private String physicalExamCode;

    /**
     * 测量项目名称
     */
    private String physicalExamName;

    /**
     * 测量项目结果
     */
    private String physicalExamValue;

    /**
     * 测量项目日期
     */
    private String physicalExamDate;

    /**
     * 测量人CODE
     */
    private String physicalExamUserCode;

    /**
     * 测量人名称
     */
    private String physicalExamUserName;

    /**
     * 数据来源
     */
    private String physicalExamSource;

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