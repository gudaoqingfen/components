package org.lshq.components.data.access.inspection.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseInspectionExamDetail implements Serializable {
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
     * 明细ID
     */
    private String detailId;

    /**
     * 序号
     */
    private String rownr;

    /**
     * 检验时间
     */
    private Date testTime;

    /**
     * 审核时间
     */
    private Date examTime;

    /**
     * 组合项目代码
     */
    private String combinationCode;

    /**
     * 组合项目名称
     */
    private String combinationName;

    /**
     * 检验项目代码
     */
    private String itemCode;

    /**
     * 检验项目名称
     */
    private String itemName;

    /**
     * 项目缩写
     */
    private String abbreviation;

    /**
     * 检验项目结果
     */
    private String itemReportResult;

    /**
     * 结果单位
     */
    private String unit;

    /**
     * 结果值标志
     */
    private String resultPoint;

    /**
     * 参考低值
     */
    private String referLow;

    /**
     * 参考高值
     */
    private String referHigh;

    /**
     * 参考范围
     */
    private String referScope;

    /**
     * 异常低值
     */
    private String low;

    /**
     * 异常高值
     */
    private String high;

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