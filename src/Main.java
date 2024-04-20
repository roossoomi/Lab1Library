
import people.People;

public class Main {
    public static void main(String[] args) {
        /*Users users = new Users();

        for (People user : Users.libraryUsers) {
           // Library library = new Library(); // Создание новой библиотеки для каждого пользователя
            System.out.println("User: " + user.toString());
            users.distributeUsersBooks(user, library);
            System.out.println("Books for " + user.getFullName() + ": " + user.getUserListBook().toString());*/
            ArchiveGUI app = new ArchiveGUI();
            app.setVisible(true);
        }
    }
