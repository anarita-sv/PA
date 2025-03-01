package exercicios.e19;

import exercicios.e19.model.Library;
import exercicios.e19.model.OldBook;
import exercicios.e19.model.RecentBook;


public class LibraryApp {

    public static void main(String[] args) {

        OldBook old = new OldBook(" El Ingenioso Hidalgo Don Quixote de la Mancha", "Miguel de Cervantes",4 );
        RecentBook recent = new RecentBook("Harry Potter and the Deathly Hallows","J K Rowling ", "1a2b3c4d5e6", 29.99);

        Library lib = new Library(" Fantastic ");
        lib.addBook(old);
        lib.addBook(recent);

        System.out.println(lib.getBook(0).compareTo(lib.getBook(1))); // -1, code 0 < code 1 
        System.out.println(lib.getBook(0).compareTo(lib.getBook(0))); // 0, code 0 == code 0
        System.out.println(lib.toString());

    

    }





    
}
