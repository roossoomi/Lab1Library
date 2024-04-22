import people.People;

import java.util.ArrayList;

public class Archive {
    private Users users;
    private Library library;
    private ArrayList<People> libraryUsers;

    public ArrayList<People> getLibraryUsers() {
        return libraryUsers;
    }

    public Archive() {
        users = new Users();
        library = new Library();
        libraryUsers = users.getlibraryUsers();
        for (People user : libraryUsers) {
            users.distributeUsersBooks(user, library);
        }
    }
}