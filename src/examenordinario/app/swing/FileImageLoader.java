package examenordinario.app.swing;

import examenordinario.model.Film;
import examenordinario.view.FilmLoader;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileImageLoader implements FilmLoader{

    private final File folder;

    public FileImageLoader(File folder) {
        this.folder = folder;
    }
    
    
    
    @Override
    public List<Film> load() {
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        ArrayList<Film> list = new ArrayList<Film>();
        File [] files = folder.listFiles(withExtension(".jpg",".png", ".jpeg"));
        String [] genre = {"Cómedia","Suspense","Acción"};
        int [] year = {2018,2019,2020};
        int [] qualification = {9,6,10};
        int [] timer = {120,150,130};
        int [] viewers = {10000,100000,10000000};
                
        int i = 0;
        for (File file : files) {
            list.add(new Film(file.getAbsolutePath(),genre[i],year[i],actors,qualification[i],timer[0],viewers[i]));
            i++;
        }
        return list;
    }

    private FilenameFilter withExtension(String... extensions) {
        return new FilenameFilter(){
            @Override
            public boolean accept(File file, String name){
                for (String extension : extensions) 
                    if(name.endsWith(extension)) return true;
                return false;
            }
        };
    }

    @Override
    public List<Film> loadGenre() {
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        ArrayList<Film> list = new ArrayList<Film>();
        File [] files = folder.listFiles(withExtension(".jpg",".png", ".jpeg"));
        String [] genre = {"Cómedia","Suspense","Acción"};
        int [] year = {2018,2019,2020};
        int [] qualification = {9,6,10};
        int [] timer = {120,150,130};
        int [] viewers = {10000,100000,10000000};
                
        int i = 0;
        for (File file : files) {
            list.add(new Film(file.getAbsolutePath(),genre[i],year[i],actors,qualification[i],timer[0],viewers[i]));
            i++;
        }
        Collections.sort(list, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
            return o1.getGenre().compareToIgnoreCase(o2.getGenre());
        }
        });
    
        return list;
    }

    @Override
    public List<Film> loadYear() {
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        ArrayList<Film> list = new ArrayList<Film>();
        File [] files = folder.listFiles(withExtension(".jpg",".png", ".jpeg"));
        String [] genre = {"Cómedia","Suspense","Acción"};
        int [] year = {2018,2019,2020};
        int [] qualification = {9,6,10};
        int [] timer = {120,150,130};
        int [] viewers = {10000,100000,10000000};
                
        int i = 0;
        for (File file : files) {
            list.add(new Film(file.getAbsolutePath(),genre[i],year[i],actors,qualification[i],timer[0],viewers[i]));
            i++;
        }
        Collections.sort(list, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
           if(o1.getYear()<o2.getYear()){return 1;}
           else if(o1.getYear()>o2.getYear()){return -1;}
           else{return 0;}
        }
         });

           return list;
    }

    @Override
    public List<Film> loadQualification() {
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        ArrayList<Film> list = new ArrayList<Film>();
        File [] files = folder.listFiles(withExtension(".jpg",".png", ".jpeg"));
        String [] genre = {"Cómedia","Suspense","Acción"};
        int [] year = {2018,2019,2020};
        int [] qualification = {9,6,10};
        int [] timer = {120,150,130};
        int [] viewers = {10000,100000,10000000};
                
        int i = 0;
        for (File file : files) {
            list.add(new Film(file.getAbsolutePath(),genre[i],year[i],actors,qualification[i],timer[0],viewers[i]));
            i++;
        }
        Collections.sort(list, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
           if(o1.getQualification()<o2.getQualification())return 1;
                else if(o1.getQualification()>o2.getQualification()){return -1;}
                else{return 0;}
           }
        });
        return list;
    }

    @Override
    public List<Film> loadViewers() {
        List <String> actors = new ArrayList<>();
        actors.add("Marcos");
        actors.add("Ana");
        actors.add("Jaime");
        ArrayList<Film> list = new ArrayList<Film>();
        File [] files = folder.listFiles(withExtension(".jpg",".png", ".jpeg"));
        String [] genre = {"Cómedia","Suspense","Acción"};
        int [] year = {2018,2019,2020};
        int [] qualification = {9,6,10};
        int [] timer = {120,150,130};
        int [] viewers = {10000,100000,10000000};
                
        int i = 0;
        for (File file : files) {
            list.add(new Film(file.getAbsolutePath(),genre[i],year[i],actors,qualification[i],timer[0],viewers[i]));
            i++;
        }
        Collections.sort(list, new Comparator<Film>(){
        @Override
        public int compare(Film o1, Film o2) {
           if(o1.getViewers()<o2.getViewers()){return 1;}
           else if(o1.getViewers()>o2.getViewers()){return -1;}
           else{return 0;}
        }
         });
        return list;
    }

}
