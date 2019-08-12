package com.zzuli.service.impl;

import com.zzuli.dao.UserDao;
import com.zzuli.dao.entity.UserEntity;
import com.zzuli.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户服务实现类
 *
 * @author Wwwwei
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public Integer createUser(UserEntity userEntity) {
        return userDao.insert(userEntity);
    }

    public Integer updateUser(UserEntity userEntity) {
        return userDao.update(userEntity);
    }

    public Integer deleteUser(Integer id) {
        return userDao.delete(id);
    }

    public UserEntity getUserById(Integer id) {
        return userDao.selectById(id);
    }
}