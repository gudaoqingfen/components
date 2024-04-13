
package org.lshq.components.data.context;


import org.lshq.components.data.dto.ServiceList;

/**
 * 本地上下文服务
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public interface ContextService {

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
	ServiceList getService(String mapKey);


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
	void setService(String mapKey, ServiceList serviceList);

}
