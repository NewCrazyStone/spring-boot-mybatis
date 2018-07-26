package com.example.demo.mapper;

import com.example.demo.model.User;


/**
 * TODO UserMapper
 *
 * @author ChenWei
 * @date 2018/7/12 15:15
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}