package com.stackroute;

import com.stackroute.domain.Actors;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
For the Movie bean, delete the constructor based object injection in the bean definition file
(beans.xml) that injects an Actor bean.
Use autowire byName in the Movie bean to inject an Actor bean.
Run the application.
Create another Movie bean and try autowire byType.
Run the application and note the exception thrown.
Fix the Movie bean by removing autowire byType and using constructor injection instead.

 */


public class MovieDemo {

    public static void main(String[] args){
        //instance of interface IOC class
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Actors actors=context.getBean("actors",Actors.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActors());

        Movie movie2=context.getBean("movie1",Movie.class);
        System.out.println(movie2.getActors());
        System.out.println((movie1==movie2));

//        //intance of interface IOC class
//        XmlBeanFactory fac= new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie1=fac.getBean("movie",Movie.class);
//        System.out.println(movie1.getActors());
//
//
    }
}
