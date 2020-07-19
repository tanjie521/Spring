package com.tanj.factory.dao.impl;


import com.tanj.factory.dao.IAccountDao;

/**
 * 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {


    private IAccountDao accountDao;
    public  void saveAccount(){

        System.out.println("保存了账户");
    }
}
