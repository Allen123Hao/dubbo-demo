package com.example.dubbo.service.serviceimpl;


import lombok.extern.slf4j.Slf4j;
import com.example.dubbo.client.DubboProviderService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <code>DubboProviderServiceImpl</code>
 *
 * @description:
 * @author: Hao Xueqiang
 * @creation: 2023/5/20
 * @version: 1.0
 */
@Slf4j
@DubboService
public class DubboProviderServiceImpl implements DubboProviderService {

    @Override
    public String provider(){
        log.info("this is dubbo provider service.");
        return "dubbo provider done";
    }
}
