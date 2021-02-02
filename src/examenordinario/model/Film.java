package examenordinario.model;

import java.util.List;

public class Film implements Comparable<Film>{

    private String name;
    private String genre;
    private List<String> actors;
    private int year;
    private int qualification;
    private int duration;
    private int viewers;

    public Film(String name, String genre, int year, List<String> actors, int qualification, int duration,int viewers) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
        this.qualification = qualification;
        this.duration = duration;
        this.viewers=viewers;
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

    public int getViewers() {
        return viewers;
    }
    
    @Override
    public boolean equals(Object b){
        if(b instanceof Film){
            Film nuevo = (Film) b;
            if (this.name.equals(((Film) b).name)){return true;}
        }
        return false;
    }

    @Override
    public int compareTo(Film o) {
        if(this.name.compareTo(o.name)>0){return 1;}
        else if(this.name.compareTo(o.name)<0){return -1;}
        else if(this.name.compareTo(o.name)==0){
            if(this.genre.compareTo(o.genre)>0){return 1;}
            else if(this.genre.compareTo(o.genre)<0){return -1;}
            else if(this.genre.compareTo(o.genre)==0){
                return 0;
            }
        }
        return 0;
    }
    
}