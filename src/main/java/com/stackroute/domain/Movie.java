package com.stackroute.domain;

import com.stackroute.domain.Actors;

import java.util.List;

public class Movie {

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








}