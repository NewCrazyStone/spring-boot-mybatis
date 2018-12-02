package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * TODO UserController
 *
 * @author ChenWei
 * @date 2018/7/12 15:15
 */



@Controller // Controller 为controller层特有注解
@RequestMapping(value = "/user") //访问的路径
public class UserController {

    //注入service 层的Javabean
    @Autowired
    private UserService userService;

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET )
    @ResponseBody
    public User queryUserById(@PathVariable int id){

        User user = userService.queryUserById(id);
        return user;
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public int addUser(User user){
        return userService.addUser(user);
    }


    /**
     * 查询id大于一个数的所有用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryAllUserById", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAllUserById(int id){
        List<User> listUser = userService.queryAllUserById(id);
        return listUser;
    }

    /**
     * 查询姓陈的傻子（根据姓氏查询）
     * @param name
     * @return
     */
    @RequestMapping(value = "/queryAllUserByFistName", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAllUserByFistName(String name){
        List<User> listUser = userService.queryAllUserByFistName(name);
        return listUser;
    }

    /**
     * 根据id更新数据库表
     * @param user
     */
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public void updateUser(User user){
        userService.updateUser(user);
    }

    /**
     * 根据id删除数据库表得信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.POST)
    @ResponseBody
    public int deleteUserById(int id){
        int count = userService.deleteUserById(id);
        return count;
    }
}
