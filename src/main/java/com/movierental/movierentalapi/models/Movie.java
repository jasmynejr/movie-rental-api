package com.movierental.movierentalapi.models;

import jakarta.persistence.*;


@Entity
@Table(name = "film")
public class Movie {
    private long id;
    private String title;
    private String description;

    public Movie(){

    }
    public Movie(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Id
    @Column(name="film_id")
        public long getId(){
            return id;
        }
    public void setId(long id){
        this.id = id;
    }

    @Column(name="title")
    public String getMovieTitle(){
        return title;
    }

    

    public void setMovieTitle(String title) {
        this.title = title;
    }

    @Column(name="description")
    public String getMovieDescription(){
        return description;
    }

    public void setMovieDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Film [id:"+id+", title:"+title+", description:"+description+"]";
    }

    
}
