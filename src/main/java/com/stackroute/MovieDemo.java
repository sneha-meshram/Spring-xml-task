package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MovieDemo {

    public static void main(String[] args){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println(movie.getActors());

        XmlBeanFactory fac= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1=fac.getBean("movie",Movie.class);
        System.out.println(movie1.getActors());



    }
}
