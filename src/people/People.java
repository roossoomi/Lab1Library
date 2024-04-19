package people;


import java.awt.print.Book;
import java.util.ArrayList;

public abstract class People {
    public String surname;
    public String name;
    public String sex;
    ArrayList userListBook;
    public ArrayList<Book> books = new ArrayList<>();
    public People(String surname, String name){
        this.surname = surname;
        this.name = name;

    }
    public People(){
        userListBook = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getUserListBook() {
        return userListBook;
    }

    public String getFullName() {
        return surname + " " + name;
    }
}
