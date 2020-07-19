package com.tanj.factory.ui;

import com.tanj.factory.factorybeans.BeanFactory;
import com.tanj.factory.service.IAccountService;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
    /*    IAccountService as = new AccountServiceImpl();
        as.saveAccount();*/
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
             as.saveAccount();
        }

    }
}
