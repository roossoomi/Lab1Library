import people.CreatingPersons;
import people.People;
import people.Students;
import people.Teachers;
import bookPackage.Book;

import java.util.ArrayList;
import java.util.Random;

public class Users {
    public static ArrayList<People> libraryUsers = new ArrayList<>();

    public static ArrayList<People> getlibraryUsers() {
        return libraryUsers;
    }

    public Users() {
        ArrayList<Students> students = CreatingPersons.generateStudents(4);
        ArrayList<Teachers> teachers = CreatingPersons.generateTeachers(2);

        libraryUsers.addAll(students);
        libraryUsers.addAll(teachers);
    }

    public void distributeUsersBooks(People user, Library library) {
        int booksQuantity = new Random().nextInt(8) + 3;

        whileLoop:
        while (user.getUserListBook().size() < booksQuantity) {
            int index = new Random().nextInt(library.getLibrary().size());
            Book book = library.getLibrary().get(index);
            for (Book bookUser : user.getUserListBook()) {
                if (bookUser.GetFullDiscription() == book.GetFullDiscription()) {
                    continue whileLoop;
                }
            }
            user.addBook(book);
        }
    }
}