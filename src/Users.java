import people.CreatingPersons;
import people.People;
import people.Students;
import people.Teachers;
import tvar.Book;
import java.util.ArrayList;
import java.util.Random;

public class Users {
    public static ArrayList<People> libraryUsers = new ArrayList<>();
    public static ArrayList<People> getlibraryUsers() {
        return libraryUsers;
    }

    public Users(){
        ArrayList<Students> students = CreatingPersons.generateStudents(4);
        System.out.println("jjjj");
        ArrayList<Teachers> teachers = CreatingPersons.generateTeachers(2);
        System.out.println("uuuu");

        libraryUsers.addAll(students);
        System.out.println(libraryUsers);
        libraryUsers.addAll(teachers);
        System.out.println(libraryUsers);
    }

    public void distributeUsersBooks(People user, Library library){
        int booksQuantity = new Random().nextInt(8) + 3;

        while (user.getUserListBook().size() < booksQuantity){
            int index = new Random().nextInt(library.getLibrary().size());
            Book book = library.getLibrary().get(index);
            System.out.println(user +  " " + book + "jjj");
            int sum =0;
            for (Book bookUser : user.getUserListBook()) {
                if(bookUser.GetFullDiscription()==book.GetFullDiscription()){
                    sum=sum+1;
                }
            }

            if(sum==0){
                user.addBook(book);
            }
        }
    }
}