package examenordinario.control;
import examenordinario.model.Film;
import examenordinario.view.FilmDisplay;
import examenordinario.view.FilmLoader;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        List <Film> films = new MFilmLoader().load();
        FilmDisplay filmsDisplay = new MFilmDisplay();
        for (Film film : films) {
            filmsDisplay.display(film);
        }

    }
    
    
    public static class MFilmDisplay implements FilmDisplay{

        @Override
        public void display(Film film) {
            System.out.println(film.getName());
        }

    }    

    public static class MFilmLoader implements FilmLoader{

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

    }
}
