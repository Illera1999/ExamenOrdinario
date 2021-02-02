package examenordinario.control;

import examenordinario.app.implementations.MFilmLoader;
import examenordinario.model.Film;
import examenordinario.view.FilmDisplay;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreOrden implements Command{
    private final Map<String,Command> commands = new HashMap<>();
    private final List <Film> film;
    private final FilmDisplay filmDisplay;

    public GenreOrden(List<Film> film, FilmDisplay filmDisplay) {
        this.film = film;
        this.filmDisplay = filmDisplay;
    }

    @Override
    public void execute() {
        for (Film film1 : film) {
            filmDisplay.display(film1);
        }
    }

    public Map<? extends String, ? extends Command> getCommand() {
        return commands;
    }
}
