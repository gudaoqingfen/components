package org.lshq.components.data.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 外部拓展 req
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
@Data
@Accessors(chain = true)
public class ExternalReq extends BaseReq{
    /**
     * 医院医共体组织代码
     */
    private String hospitalOrgCode;
    /**
     * 医院医共体组织名称
     */
    private String hospitalOrgName;
    /**
     * 医院医共体子组织代码
     */
    private String hospitalSubOrgCode;
    /**
     * 医院医共体子组织名称
     */
    private String hospitalSubOrgName;

    /**
     * 接口id
     */
    private String interfaceId;

    /**
     * 外部业务obj
     */
    private Object externalBusinessObj;
}
