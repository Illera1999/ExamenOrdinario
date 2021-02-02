package examenordinario.app.implementations;

import examenordinario.model.Film;
import examenordinario.view.FilmLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MFilmLoader implements FilmLoader{

    @Override
    public List<Film> load() {
        List <Film> list = new ArrayList<>();
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        list.add(new Film("Ladrón en casa 1","Cómedia",2018,actors,9,120));
        list.add(new Film("Ladrón en casa 2","Suspense",2019,actors,6,150));
        list.add(new Film("Ladrón en casa 3","Acción",2020,actors,10,130));
        return list;
    }

    @Override
    public List<Film> loadGenre() {
        List <Film> film = this.load();
        Collections.sort(film, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
            return o1.getGenre().compareToIgnoreCase(o2.getGenre());
        }
        });
    
        return film;
    }

    @Override
    public List<Film> loadYear() {
        List <Film> film = this.load();
        Collections.sort(film, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
           if(o1.getYear()<o2.getYear()){return 1;}
           else if(o1.getYear()>o2.getYear()){return -1;}
           else{return 0;}
        }
         });

           return film;
    }
    @Override
    public List<Film> loadQualification() {
        List <Film> film = this.load();
        Collections.sort(film, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
           if(o1.getQualification()<o2.getQualification())return 1;
                else if(o1.getQualification()>o2.getQualification()){return -1;}
                else{return 0;}
           }
        });
        return film;
    }
   
}