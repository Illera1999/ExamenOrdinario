package examenordinario.control;

import examenordinario.app.implementations.MFilmLoader;
import examenordinario.model.Film;
import examenordinario.view.FilmDisplay;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitCommand implements Command{
    private final Map<String,Command> commands = new HashMap<>();
    private final List <Film> film;
    private final FilmDisplay filmDisplay;

    public InitCommand(List<Film> film, FilmDisplay filmDisplay) {
        this.film = film;
        this.filmDisplay = filmDisplay;
    }

    @Override
    public void execute() {
        for (Film film1 : film) {
            filmDisplay.display(film1);
        }
        commands.put("Por genero", new GenreOrden(new MFilmLoader().loadGenre(),filmDisplay));
        commands.put("Por actualidad", new YearOrden(new MFilmLoader().loadYear(),filmDisplay));
        commands.put("Por valoración", new QualificationOrden(new MFilmLoader().loadQualification(),filmDisplay));
        commands.put("Salir", new ExitCommand());
    }

    public Map<? extends String, ? extends Command> getCommand() {
        return commands;
    }
}