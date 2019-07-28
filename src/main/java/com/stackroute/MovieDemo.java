package com.stackroute;

import com.stackroute.domain.Actors;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
Movie class and print out their results..
 */


public class MovieDemo {

    public static void main(String[] args){
        //instance of interface IOC class
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Actors actors=context.getBean("actors",Actors.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActors());


    }
}
