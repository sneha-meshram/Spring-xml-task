package com.stackroute;

import com.stackroute.domain.Actors;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MovieDemo {

    public static void main(String[] args){
        //instance of interface IOC class
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Actors actors=context.getBean("actors",Actors.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActors());

        Movie movie2=context.getBean("movie1",Movie.class);
        System.out.println(movie2.getActors());
        System.out.println(movie1==movie2);

//        //intance of interface IOC class
//        XmlBeanFactory fac= new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie1=fac.getBean("movie",Movie.class);
//        System.out.println(movie1.getActors());
//
//



    }
}
