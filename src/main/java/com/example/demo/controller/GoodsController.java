package com.example.demo.controller;

import com.example.demo.model.Goods;
import com.example.demo.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Snowy on 2018/12/2.
 * QQ:461842166
 * GitHub:Shengdi-Gu
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public int addGoods(Goods goods) {
        int count = goodsService.addGoods(goods);
        return count;
    }


    /**
     * 查询所有数据
     *
     * @return
     */
    @RequestMapping(value = "query", method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> queryGoods() {
        List<Goods> listGoods = goodsService.queryGoods();
        return listGoods;
    }

    /**
     * 更新数据
     * @param goods
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public int updateGoods(Goods goods) {
        int count = goodsService.updateGoods(goods);
        return count;
    }
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ResponseBody
    public int deleteGoods(int id){
        int count = goodsService.deleteGoods(id);
        return count;
    }
}
