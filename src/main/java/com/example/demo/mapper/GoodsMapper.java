package com.example.demo.mapper;

import com.example.demo.model.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> queryGoods();

    int updateGoods(Goods goods);

    int addGoods(Goods goods);

    int deleteGoods(int id);
}