package org.lshq.components.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 基础resp
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class BaseResp<T> implements Serializable {
    /**
     * 返回 code 码
     */
    private String code;

    /**
     * 泛型数据
     */
    T data;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 当前页（分页相关参数）
     */
    private Long currentPage;

    /**
     * 总数
     */
    private Long total;
}