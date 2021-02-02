package examenordinario.model;

import java.util.List;

public class Film {

    private String name;
    private String genre;
    private List<String> actors;
    private int year;
    private int qualification;
    private int duration;

    public Film(String name, String genre, int year, List<String> actors, int qualification, int duration) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
        this.qualification = qualification;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getQualification() {
        return qualification;
    }

    public int getDuration() {
        return duration;
    }
    
    
    
    
}
