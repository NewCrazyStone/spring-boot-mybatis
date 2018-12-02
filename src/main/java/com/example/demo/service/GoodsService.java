package com.example.demo.service;

import com.example.demo.model.Goods;

import java.util.List;

/**
 * Created by Snowy on 2018/12/2.
 * QQ:461842166
 * GitHub:Shengdi-Gu
 */
public interface GoodsService {
    int addGoods(Goods goods);

    List<Goods> queryGoods();

    int updateGoods(Goods goods);

    int deleteGoods(int id);
}
