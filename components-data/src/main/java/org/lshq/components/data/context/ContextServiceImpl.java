
package org.lshq.components.data.context;


import org.lshq.components.data.dto.ServiceList;
import java.util.concurrent.ConcurrentHashMap;

final class ContextServiceImpl implements ContextService {
	private static final ConcurrentHashMap<String, ServiceList> CONTEXT_HOLDER_MAP = new ConcurrentHashMap<String, ServiceList>(64);


	/**
	 * 获取对象
	 *
	 * @param mapKey
	 * @return {@link ServiceList }
	 * @author zhh
	 * @date 2024-04-13
	 * <p>
	 * {@link, }
	 */
	@Override
	public ServiceList getService(String mapKey) {
		if (CONTEXT_HOLDER_MAP.get(mapKey) == null) {
			return null;
		}
		return CONTEXT_HOLDER_MAP.get(mapKey);
	}

	/**
	 * 设置对象
	 *
	 * @param mapKey
	 * @param serviceList
	 * @author zhh
	 * @date 2024-04-13
	 * <p>
	 * {@link, }
	 */
	@Override
	public void setService(String mapKey, ServiceList serviceList) {
		CONTEXT_HOLDER_MAP.putIfAbsent(mapKey, serviceList);
	}

}
