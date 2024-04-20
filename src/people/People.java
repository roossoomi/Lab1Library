package people;
import tvar.Book;
import java.util.ArrayList;

public abstract class People {
    public String surname;
    public String name;
    public String sex;
    public ArrayList<Book> userListBook; // Изменение типа списка

    public People(String surname, String name) {
        this.surname = surname;
        this.name = name;
        userListBook = new ArrayList<Book>(); // Инициализация списка в конструкторе
    }

    public ArrayList<Book> getUserListBook() {
        return userListBook;
    }

    public void addBook(Book book) { // Изменение параметра метода
        userListBook.add(book);
    }

    public String getFullName() {
        return surname + " " + name;
    }


}