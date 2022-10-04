package com.movierental.movierentalapi.models;

import jakarta.persistence.*;


@Entity
@Table(name = "film")
public class Movie {
    private long id;
    private String title;
    private String description;
    private int releaseYear;
    private float price;
    private int length;
    private String rating;
    private String specialFeatures;
    public Movie(){

    }
    public Movie(String title, String description) {
        this.title = title;
        this.description = description;
    }

    
    public Movie(String title, String description, int releaseYear, float price, int length, String rating,
            String specialFeatures) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.price = price;
        this.length = length;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
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
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="description")
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="release_year")
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Column(name="rental_rate")
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name="length")
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Column(name="rating")
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    @Column(name="special_features")
    public String getSpecialFeatures() {
        return specialFeatures;
    }
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    @Override
    public String toString(){
        return "Film [id:"+id+", title:"+title+", description:"+description+"]";
    }

    
}
