package com.stackroute.domain;

import com.stackroute.domain.Actors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import java.util.List;

public class Movie  {

    List<Actors> actors;

    public Movie(List<Actors> actors) {
        this.actors= actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actors=" + actors +
                '}';
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }

    //overriding method of BeanFactory.
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("implementing the beanFactoryAware");
//    }
//
//    //overriding method of BeanName.
//
//    @Override
//    public void setBeanName(String str)
//    {
//        System.out.println("implementing BeanNameAware,bean name is " +str);
//    }
//
//    //overriding method of ApplicationContext.
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("implementing AppicationContextAware");
//    }


}