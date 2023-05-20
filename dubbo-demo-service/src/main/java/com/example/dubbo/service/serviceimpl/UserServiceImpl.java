package com.example.dubbo.service.serviceimpl;

import com.example.dubbo.client.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <code>UserServiceImpl</code>
 *
 * @description:
 * @author: Hao Xueqiang
 * @creation: 2023/5/20
 * @version: 1.0
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "Allen";
    }
}
