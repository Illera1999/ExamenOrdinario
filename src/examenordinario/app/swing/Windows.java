package examenordinario.app.swing;

import examenordinario.app.Main;
import examenordinario.app.implementations.MFilmDisplay;
import examenordinario.app.implementations.MFilmLoader;
import examenordinario.control.Command;
import examenordinario.control.GenreOrden;
import examenordinario.control.QualificationOrden;
import examenordinario.control.ViewersOrden;
import examenordinario.control.YearOrden;
import examenordinario.model.Film;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Windows extends JFrame{

    private MFilmDisplay filmDisplay;
    private Map<String,Command> commands = new HashMap <>();

    public Windows() {
        this.setTitle("BillBoard");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(billboard());
        this.add(toolbar(),BorderLayout.SOUTH);
        
        List<Film> film = new FileImageLoader(new File("Imagenes")).load();
        for (Film film1 : film) {
            this.filmDisplay.display(film1);
        }
        
        commands.put("GENRE", new GenreOrden(new MFilmLoader().loadGenre(),filmDisplay));
        commands.put("YEAR", new YearOrden(new MFilmLoader().loadYear(),filmDisplay));
        commands.put("QUALIFICATION", new QualificationOrden(new MFilmLoader().loadQualification(),filmDisplay));
        commands.put("VIEWERS", new ViewersOrden(new MFilmLoader().loadViewers(),filmDisplay));
    }
    public static void main(String[] args) {
        //new Main().execute();
        new Windows();
    }

    
    private void execute() {
        this.setVisible(true);
    }

    private JPanel billboard() {
        BillBoard panel = new BillBoard();
        return panel;
    }

    private JMenuBar toolbar() {
        JMenuBar toolbar = new JMenuBar();
        toolbar.setLayout(new FlowLayout(CENTER));
        toolbar.add(button("Genre"));
        toolbar.add(button("Year"));
        toolbar.add(button("Qualification"));
        toolbar.add(button("Viewrs"));
        return toolbar;
    }

    private JButton button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                commands.get(name).execute();
            }
            
        });
        return button;
    }
    
    
    
}
