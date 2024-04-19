package people;

import java.util.ArrayList;

public class Users {
    public static ArrayList<Object> libraryUsers = new ArrayList<>();

 public Users(){
    libraryUsers.add(CreatingPersons.generateStudents(5));
    libraryUsers.add(CreatingPersons.generateTeachers(6));

     //libraryUsers.addAll(CreatingPersons.users);

 }
}