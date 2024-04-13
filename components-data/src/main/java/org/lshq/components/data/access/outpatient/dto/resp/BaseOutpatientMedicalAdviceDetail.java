package org.lshq.components.data.access.outpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseOutpatientMedicalAdviceDetail implements Serializable {
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
     * 医嘱ID
     */
    private String orderId;

    /**
     * 医嘱明细ID
     */
    private String orderSubId;

    /**
     * 医嘱项目类型代码
     */
    private String medicalOrderType;

    /**
     * 医嘱项目类型名称
     */
    private String medicalOrderName;

    /**
     * 药品规格
     */
    private String itemSpec;

    /**
     * 医嘱组号
     */
    private String groupNo;

    /**
     * 次剂量
     */
    private String physicDosage;

    /**
     * 次剂量单位
     */
    private String physicDosageUnit;

    /**
     * 用药总剂量
     */
    private String physicAmount;

    /**
     * 用药总剂量单位
     */
    private String physicAmountUnit;

    /**
     * 频次
     */
    private String physicFreq;

    /**
     * 天数
     */
    private String physicDays;

    /**
     * 用药方法代码
     */
    private String usageCode;

    /**
     * 用药方法名称
     */
    private String usageName;

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