package people;

import java.util.ArrayList;

public class Users {
    static ArrayList<People> libraryUsers = new ArrayList<>();

 public Users(){
    CreatingPersons.generateStudents(5);
    CreatingPersons.generateTeachers(6); }

 public void createPersons(){
     libraryUsers.addAll(allStudents)
 }
}