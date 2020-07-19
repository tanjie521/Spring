package com.tanj.factory.service.impl;


import com.tanj.factory.dao.IAccountDao;
import com.tanj.factory.factorybeans.BeanFactory;
import com.tanj.factory.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl() {
        System.out.println("创建对象AccountServiceImpl");
    }

   /* private IAccountDao accountDao = null;*/

 private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
   private int i = 1;

    public void  saveAccount(){
       // int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
