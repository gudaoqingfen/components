package org.lshq.components.data.dto;


import lombok.Data;
import org.lshq.components.data.service.DataConvertService;
import org.lshq.components.data.service.DataProviderService;

/**
 * 服务列表
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
@Data
public class ServiceList {

	/**
	 * 数据供应服务
	 */
	private DataProviderService dataProviderService;

	/**
	 * 数据转换服务
	 */
	private DataConvertService dataConvertService;
}
