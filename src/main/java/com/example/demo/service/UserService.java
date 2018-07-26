package com.example.demo.service;

import com.example.demo.model.User;

/**
 * TODO UserService
 *
 * @author ChenWei
 * @date 2018/7/12 16:02
 */
public interface UserService {

    User queryUserById(int id);

    int addUser(User user);
}
