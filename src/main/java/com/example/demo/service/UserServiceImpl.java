package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * TODO UserService
 *
 * @author ChenWei
 * @date 2018/7/12 15:19
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserMapper userMapper;

    @Override
    public User queryUserById(int id){

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
