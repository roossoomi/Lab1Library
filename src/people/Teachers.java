package people;

import people.People;

public class Teachers extends People {
    public String patronymic;
    public Teachers(String surname, String name, String patronymic) {
        super(surname, name);
        this.patronymic = patronymic;
    }
    @Override
    public String getFullName(){
        return surname + " " + name + " " + patronymic;
    }
}
