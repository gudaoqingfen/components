package org.lshq.components.data.access.patient.dto.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.lshq.components.data.dto.ExternalReq;

import java.util.Date;

/**
 * 基本患者信息 Req
 * 凡标注标准字段，不可随意更改需随接口文档同步修改
 *
 * @author zhh
 * @date 2024-04-12
 * <p>
 * {@link ,}
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class BasePatientInfoReq extends ExternalReq {
    /**
     * 医共体机构编码
     * 标准字段
     */
    private String orgCode;
    /**
     * 医共体下级机构编码
     * 标准字段
     */
    private String subOrgCode;
    /**
     * 患者 id
     * 标准字段
     */
    private String patientId;
    /**
     * 开始时间 根据最后根据时间时间段抽取
     * 标准字段
     */
    private Date startTime;
    /**
     * 结束时间 根据最后根据时间时间段抽取
     * 标准字段
     */
    private Date endTime;
    /**
     * 页面索引 分页参数
     * 标准字段
     */
    private String pageIndex;
    /**
     * 页面大小 分页参数
     * 标准字段
     */
    private String pageSize;
    /**
     * 患者姓名
     * 标准字段
     */
    private String patientName;
    /**
     * 身份证号码
     * 标准字段
     */
    private String idCardNo;
    /**
     * 电话
     * 标准字段
     */
    private String phone;
}
