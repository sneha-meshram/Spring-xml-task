package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("implementing the InitializingBean Interface class");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("implementing the DisposableBean interface class");
    }

    //customInit() created.

    public void customInit(){
        System.out.println("customInit() is invoked or initialize..");
    }

    //customDestroy created.

    public void customDestroy(){
        System.out.println("customDestroy() is invoked or initialize..");
    }
}
