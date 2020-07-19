package com.tanj.spring.ui;


import com.tanj.factory.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class client {
    /**
     * 获取spring 的IOC核心容器，并根据id获取对象
     * ApplicationContext的三个常用实现类：
     * ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。(更常用)
     * FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件(必须有访问权限）
     * <p>
     * AnnotationConfigApplicationContext：它是用于读取注解创建容器的，是明天的内容。
     * <p>
     * 核心容器的两个接口引发出的问题：
     * ApplicationContext:     单例对象适用              采用此接口
     * 它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
     * <p>
     * BeanFactory:            多例对象使用
     * 它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     *
     * @param args
     */
    public static void main(String[] args) {
       /* //1.获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springBean.xml");
        //        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhy\\Desktop\\bean.xml");
        //2.根据id获取对象
        IAccountService bean = applicationContext.getBean(IAccountService.class);
        IAccountDao bean1 = applicationContext.getBean(IAccountDao.class);
        System.out.println(bean);
        System.out.println(bean1);
        bean.saveAccount();*/

        //--------BeanFactory----------
        Resource resource = new ClassPathResource("springBean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        IAccountService as  = (IAccountService)factory.getBean("accountService");
        as.saveAccount();
        System.out.println(as);
    }

}
