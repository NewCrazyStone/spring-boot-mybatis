package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

/**
 * TODO UserService
 *
 * @author ChenWei
 * @date 2018/7/12 16:02
 */
public interface UserService {

    User queryUserById(int id);

    int addUser(User user);

    List<User> queryAllUserById(int id);

    List<User> queryAllUserByFistName(String name);

    void updateUser(User user);

    int deleteUserById(int id);
}
