
package org.lshq.components.data.context;


import org.lshq.components.data.dto.ServiceList;
import org.lshq.components.data.service.DataConvertService;
import org.lshq.components.data.service.DataProviderService;

/**
 * 本地上下文持有者
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public final class ContextHolder {


	private final static ContextService ContextService;


	static {
		ContextService = new ContextServiceImpl();
	}

	/**
	 * 设置提供服务
	 *
	 * @param mapKey
	 * @param dataProviderService
	 * @author zhh
	 * @date 2024-04-13
	 * <p>
	 * {@link, }
	 */
	public static void setProviderService(String mapKey, DataProviderService dataProviderService) {
		ServiceList serviceList = ContextService.getService(mapKey);
		if (serviceList == null) {
			serviceList = new ServiceList();
		}
		serviceList.setDataProviderService(dataProviderService);
		ContextService.setService(mapKey, serviceList);

	}

	/**
	 * 设置转换服务
	 *
	 * @param mapKey
	 * @param dataConvertService 数据转换服务
	 * @author zhh
	 * @date 2024-04-13
	 * <p>
	 * {@link, }
	 */
	public static void setConvertService(String mapKey, DataConvertService dataConvertService) {
		ServiceList serviceList = ContextService.getService(mapKey);
		if (serviceList == null) {
			serviceList = new ServiceList();
		}
		serviceList.setDataConvertService(dataConvertService);
		ContextService.setService(mapKey, serviceList);

	}

	/**
	 * 获取服务
	 *
	 * @param mapKey 映射键
	 * @return {@link ServiceList }
	 * @author zhh
	 * @date 2024-04-13
	 * <p>
	 * {@link, }
	 */
	public static ServiceList getService(String mapKey) {
		return ContextService.getService(mapKey);
	}

}
