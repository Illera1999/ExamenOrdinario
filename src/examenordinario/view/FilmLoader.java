package examenordinario.view;

import examenordinario.model.Film;
import java.util.List;


public interface FilmLoader {
    List <Film> load();
    List <Film> loadGenre();
    List <Film> loadYear();
    List <Film> loadQualification();
}
