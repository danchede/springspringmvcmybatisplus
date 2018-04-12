package com.ifox.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ifox.mapper.UserMapper;
import com.ifox.entity.system.User;
import com.ifox.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:51 2018/4/12
 * @Modified By:    User 表数据服务层接口实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

}
