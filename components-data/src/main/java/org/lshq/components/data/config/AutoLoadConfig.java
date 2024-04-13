package org.lshq.components.data.config;

import org.lshq.components.data.context.ContextHolder;
import org.lshq.components.data.service.DataConvertService;
import org.lshq.components.data.service.DataProviderService;

import java.util.List;

/**
 * 自动加载配置
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public class AutoLoadConfig {

    /**
     * 自动加载配置
     *
     * @param dataProviderServiceList 数据提供程序服务列表
     * @param dataConvertServiceList  数据转换服务列表
     * @author zhh
     * @date 2024-04-13
     * <p>
     * {@link, }
     */
    public AutoLoadConfig(List<DataProviderService> dataProviderServiceList, List<DataConvertService> dataConvertServiceList) {
        for (DataProviderService dataProviderService : dataProviderServiceList) {
            ContextHolder.setProviderService(dataProviderService.hospitalAgreement().getCode() + dataProviderService.businessCode().getCode(), dataProviderService);
        }
        for (DataConvertService resultConvertService : dataConvertServiceList) {
            ContextHolder.setConvertService(resultConvertService.hospitalAgreement().getCode() + resultConvertService.businessCode().getCode(), resultConvertService);
        }
    }
}
