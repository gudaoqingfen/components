package org.lshq.components.data.access.patient.dto.resp;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.lshq.components.data.dto.ExternalResp;

/**
 * 基础患者基本信息
 * 凡标注标准字段，不可随意更改需随接口文档同步修改
 *
 * @author zhh
 * @date 2024-04-12
 * <p>
 * {@link ,}
 */
@Data
public class BasePatientInfoResp extends ExternalResp implements Serializable {

    /**
     * 患者唯一ID
     * 标准字段
     */
    private String patientId;

    /**
     * 患者姓名
     * 标准字段
     */
    private String patientName;

    /**
     * 性别代码
     * 标准字段
     */
    private String genderCode;

    /**
     * 性别描述
     * 标准字段
     */
    private String gender;

    /**
     * 证件类型代码
     * 标准字段
     */
    private String idCardTypeCode;

    /**
     * 证件类型
     * 标准字段
     */
    private String idCardType;

    /**
     * 证件号码
     * 标准字段
     */
    private String idCardNo;

    /**
     * 患者出生日期
     * 标准字段
     */
    private Date birthday;

    /**
     * 患者年龄
     * 标准字段
     */
    private String age;

    /**
     * 患者联系方式手机号码
     * 标准字段
     */
    private String phone;

    /**
     * 民族代码
     * 标准字段
     */
    private String nationCode;

    /**
     * 民族
     * 标准字段
     */
    private String nation;

    /**
     * 国籍代码
     * 标准字段
     */
    private String countryCode;

    /**
     * 国籍
     * 标准字段
     */
    private String country;

    /**
     * 现地址-省
     * 标准字段
     */
    private String province;

    /**
     * 现地址-市
     * 标准字段
     */
    private String city;

    /**
     * 现地址-县
     * 标准字段
     */
    private String county;

    /**
     * 现地址-乡
     * 标准字段
     */
    private String town;

    /**
     * 现地址-村
     * 标准字段
     */
    private String village;

    /**
     * 现住址
     * 标准字段
     */
    private String address;

    /**
     * 建卡时间
     * 标准字段
     */
    private Date operateTime;

    /**
     * 最后更新时间
     * 标准字段
     */
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;
}