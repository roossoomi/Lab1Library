package people;

import people.People;

public class Students extends People {
    public Students(String surname, String name) {
        super(surname, name);
    }
  @Override
    public String getFullName(){
        return surname + " " + name;
  }
}
