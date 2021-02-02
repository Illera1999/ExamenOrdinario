package examenordinario.app.implementations;

import examenordinario.model.Film;
import examenordinario.view.FilmDisplay;

public class MFilmDisplay implements FilmDisplay{

        @Override
        public void display(Film film) {
            System.out.println(film.getName());
        }

}