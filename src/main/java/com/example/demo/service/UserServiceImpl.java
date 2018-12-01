package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public List<User> queryAllUserById(int id) {
        List<User> listUser = userMapper.queryAllUserById(id);
        return listUser;
    }

    @Override
    public List<User> queryAllUserByFistName(String name) {
        String nameStr = name + "%";
        List<User> listUser = userMapper.queryAllUserByFistName(nameStr);
        return listUser;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        int count = userMapper.deleteUserById(id);
        return count;
    }
}
