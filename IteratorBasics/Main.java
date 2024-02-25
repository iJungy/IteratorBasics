package IteratorBasics;


import java.util.Iterator;

/**
 * Clase cliente
 */
public class Main {
    public static void main (String [] args) {
        
        MyMarvelCollection collection = new MyMarvelCollection ();

        
        collection.add (new Film ("Ironman", 2008));
        collection.add (new Film ("Captain America", 2010));
        collection.add (new Film ("The Avengers", 2012));

        System.out.println ("Objeto a iterar...");
        Iterator<Film> iterator = collection.iterator();
        while (iterator.hasNext ()) {
            System.out.println (iterator.next ());
        }

        for (Film f: collection) {
            System.out.println (f);
        }
    }
}
 
