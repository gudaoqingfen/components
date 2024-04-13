package org.lshq.components.data.access.inpatient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseInpatientAdmissionRecord implements Serializable {
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
     * 患者主诉
     */
    private String mainSymptom;

    /**
     * 现病史
     */
    private String nowIiness;

    /**
     * 既往史
     */
    private String historyIiness;

    /**
     * 过敏史
     */
    private String allergyHistory;

    /**
     * 个人史
     */
    private String personIiness;

    /**
     * 月经史
     */
    private String mensesHistory;

    /**
     * 传染病史
     */
    private String infectionHistory;

    /**
     * 婚育史
     */
    private String maritalHistory;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 体格检查
     */
    private String physicalCheck;

    /**
     * 体格检查-体温
     */
    private String bodyTemperature;

    /**
     * 体格检查-脉率
     */
    private String pulses;

    /**
     * 体格检查–呼吸频率
     */
    private String breathingRate;

    /**
     * 体格检查–收缩压
     */
    private String sbp;

    /**
     * 体格检查–舒张压
     */
    private String dbp;

    /**
     * 体格检查–一般情况
     */
    private String generalInformation;

    /**
     * 体格检查–皮肤及黏膜
     */
    private String skinMucous;

    /**
     * 体格检查–浅表淋巴结
     */
    private String superficialLymph;

    /**
     * 体格检查–头部及其器官
     */
    private String headOrgans;

    /**
     * 体格检查–颈部
     */
    private String neck;

    /**
     * 体格检查–胸廓
     */
    private String chest;

    /**
     * 体格检查–肺部
     */
    private String lungs;

    /**
     * 体格检查–心胀
     */
    private String heart;

    /**
     * 体格检查–周围器官
     */
    private String peripheralOrgans;

    /**
     * 体格检查–腹部
     */
    private String abdomen;

    /**
     * 体格检查–肛门外生殖器
     */
    private String external;

    /**
     * 体格检查–脊柱
     */
    private String spine;

    /**
     * 体格检查–四肢
     */
    private String limb;

    /**
     * 体格检查–神经系统
     */
    private String nervousSystem;

    /**
     * 出院诊断
     */
    private String outDiagnosis;

    /**
     * 初步诊断
     */
    private String preDiagnosis;

    /**
     * 入院时间
     */
    private Date inTime;

    /**
     * 出院时间
     */
    private Date outTime;

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