package org.lshq.components.data.access.physical.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BasePhysicalExamRecord implements Serializable {
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
     * 性别编码
     */
    private String genderCode;

    /**
     * 性别
     */
    private String genderName;

    /**
     * 检查日期
     */
    private Date examTime;

    /**
     * 体检结果
     */
    private String examResult;

    /**
     * 体检医生
     */
    private String examDoctor;

    /**
     * 身高(cm)
     */
    private String height;

    /**
     * 体重(kg)
     */
    private String weight;

    /**
     * 腰围(cm)
     */
    private String waistline;

    /**
     * 收缩压(mmHg)
     */
    private String sbp;

    /**
     * 舒张压(mmHg)
     */
    private String dbp;

    /**
     * 空腹血糖(mmmol/L)
     */
    private String fpg;

    /**
     * 总胆固醇（mmol/L）
     */
    private String tcho;

    /**
     * 甘油三酯(mmmol/L)
     */
    private String gly;

    /**
     * 高密度脂蛋白(mmmol/L)
     */
    private String hdl;

    /**
     * 低密度脂蛋白(mmmol/L)
     */
    private String ldl;

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