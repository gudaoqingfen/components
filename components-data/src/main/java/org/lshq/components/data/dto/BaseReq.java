package org.lshq.components.data.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 基础要求
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
@Data
@Accessors(chain = true)
public class BaseReq {
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
}
