package org.lshq.components.data.access.outpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseOutpatientSettleRecord implements Serializable {
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
     * 费用来源代码
     */
    private String feeSourceCode;

    /**
     * 费用来源名称
     */
    private String feeSourceName;

    /**
     * 收费项目编码
     */
    private String itemClassCode;

    /**
     * 收费项目名称
     */
    private String itemClassName;

    /**
     * 收费项目数量
     */
    private String itemNum;

    /**
     * 收费项目单位
     */
    private String unit;

    /**
     * 收费项目单价
     */
    private String price;

    /**
     * 收费项目总价
     */
    private String totalPrice;

    /**
     * 开单科室编码
     */
    private String billingDeptCode;

    /**
     * 开单科室名称
     */
    private String billingDeptName;

    /**
     * 执行科室编码
     */
    private String execDeptCode;

    /**
     * 执行科室名称
     */
    private String execDeptName;

    /**
     * 开单人编码
     */
    private String drawerCode;

    /**
     * 开单人姓名
     */
    private String drawerName;

    /**
     * 最后更新时间
     */
    private String lastUpddateTime;

    /**
     * 是否删除 1=软删除 0 未删除
     */
    private Boolean deleteFlag;

    /**
     * 创建人
     */
    private Boolean createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Boolean updateBy;

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