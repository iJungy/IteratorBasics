package IteratorBasics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyMarvelCollection implements IterableCollection<Film>
{
    private List<Film> films;

    public MyMarvelCollection(){
        this.films = new ArrayList<>();
    }

    @Override
    public void add(Film item){
        films.add(item);
    }
    
    public Iterator<Film> iterator(){
        return films.iterator();
    }
}