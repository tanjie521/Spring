package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")*/
public class AccountServiceTest {

/*    @Autowired
    private  IAccountService as;*/

    @Test
    public void testFindAll() {

        ApplicationContext   beans =new ClassPathXmlApplicationContext("bean.xml");
        IAccountService bean = (IAccountService) beans.getBean("accountService");
        //3.执行方法
        List<Account> accounts = bean.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

  /*  @Test
    public void testFindOne() {
        //3.执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        //3.执行方法
        as.saveAccount(account);

    }

    @Test
    public void testUpdate() {
        //3.执行方法
        Account account = as.findAccountById(4);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //3.执行方法
        as.deleteAccount(4);
    }*/
}
