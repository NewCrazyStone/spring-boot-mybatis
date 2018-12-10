package com.example.demo.service;

import com.example.demo.mapper.CustomerMapper;
import com.example.demo.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Snowy
 * @version 1.0
 * @description CustomerServiceImpl
 * @date 2018/12/3
 */

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int addCustomer(Customer customer) {
        int count = customerMapper.insertSelective(customer);
        return count;
    }
}
