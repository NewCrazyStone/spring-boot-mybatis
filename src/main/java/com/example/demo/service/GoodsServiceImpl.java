package com.example.demo.service;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.model.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Snowy on 2018/12/2.
 * QQ:461842166
 * GitHub:Shengdi-Gu
 */
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods) {

        int count = goodsMapper.addGoods(goods);
        return count;
    }

    @Override
    public List<Goods> queryGoods() {
        List<Goods> listGoods = goodsMapper.queryGoods();
        return listGoods;
    }

    @Override
    public int updateGoods(Goods goods) {
        int count = goodsMapper.updateGoods(goods);
            return count;

    }

    @Override
    public int deleteGoods(int id) {
        int count = goodsMapper.deleteGoods(id);
        return count;
    }
}
