package com.stackroute;

import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actors;
import com.stackroute.domain.Movie;
import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
InitializingBean and DisposableBean.
Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
 */


public class MovieDemo {

    public static void main(String[] args){
        //instance of interface IOC class
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Actors actors=context.getBean("actors",Actors.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActors());


        //calling method for BeanLifecycleDemoBean class.
        ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean demoBean=(BeanLifecycleDemoBean) context1.getBean("beanLifecycleDemoBean");

        //calling method of BeanPostProcessor class.
        BeanPostProcessor beanPostProcessor=context1.getBean("beanPostProcessorDemoBean", BeanPostProcessorDemoBean.class);






    }
}
