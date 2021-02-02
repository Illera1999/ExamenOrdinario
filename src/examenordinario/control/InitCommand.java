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
        commands.put("GENRE", new GenreOrden(new MFilmLoader().loadGenre(),filmDisplay));
        commands.put("YEAR", new YearOrden(new MFilmLoader().loadYear(),filmDisplay));
        commands.put("QUALIFICATION", new QualificationOrden(new MFilmLoader().loadQualification(),filmDisplay));
        commands.put("VIEWERS", new ViewersOrden(new MFilmLoader().loadViewers(),filmDisplay));
        commands.put("EXIT", new ExitCommand());
    }

    public Map<? extends String, ? extends Command> getCommand() {
        return commands;
    }
}