package people;

import java.util.ArrayList;
import java.util.Random;

public class CreatingPersons {


    private static final String[] maleNames = {"Иван", "Олег", "Макар", "Владимир", "Петр", "Роман", "Семен", "Александр",
            "Виктор", "Константин", "Денис", "Даниил", "Ефим", "Егор", "Игнат"};
    private static final String[] femaleNames = {"Анна", "Мария", "Елена", "Ольга", "Татьяна", "Ирина", "Светлана", "Наталья",
            "Екатерина", "Александра", "Валентина", "Людмила", "Надежда", "Вера", "Лариса", "Галина"};
    private static final String[] surnames = {"Иванов", "Петров", "Сидоров", "Кузнецов", "Смирнов", "Попов", "Морозов",
            "Новиков", "Козлов", "Лебедев", "Соколов", "Козлов", "Павлов", "Волков",
            "Соловьев", "Васильев", "Зайцев", "Поляков", "Григорьев", "Орлов",
            "Макаров", "Алексеев", "Козлов", "Лебедев", "Титов", "Федоров",
            "Комаров", "Беляев", "Гусев", "Жуков", "Тарасов", "Зыков", "Шадрин", "Кудряшов", "Пименов", "Забелин", "Чулков", "Быстров", "Муравьев", "Поликарпов", "Сафронов", "Шувалов", "Казанцев", "Беловодов", "Кожухов", "Фомичев"
    };

    private static Random random = new Random();

    public static ArrayList<Students> generateStudents(int studentNumber) {
        ArrayList<Students> allStudents = new ArrayList<>();
        for (int i = 0; i < studentNumber; i++) {
            String name;
            String surname;
            if (random.nextBoolean()) {
                name = maleNames[random.nextInt(maleNames.length)];
                surname = surnames[random.nextInt(surnames.length)];
            } else {
                name = femaleNames[random.nextInt(femaleNames.length)];
                surname = surnames[random.nextInt(surnames.length)] + "а";
            }
            Students student = new Students(surname, name);
            allStudents.add(student);
        }
        return allStudents;
    }

    public static ArrayList<Teachers> generateTeachers(int teacherNumber) {
        ArrayList<Teachers> allTeachers = new ArrayList<>();
        for (int i = 0; i < teacherNumber; i++) {
            String name;
            String surname;
            String patronymic;
            if (random.nextBoolean()) {
                name = maleNames[random.nextInt(maleNames.length)];
                surname = surnames[random.nextInt(surnames.length)];
                patronymic = maleNames[random.nextInt(maleNames.length)] + "ович";
            } else {
                name = femaleNames[random.nextInt(femaleNames.length)];
                surname = surnames[random.nextInt(surnames.length)] + "а";
                patronymic = maleNames[random.nextInt(maleNames.length)] + "овна";
            }
            Teachers teacher = new Teachers(surname, name, patronymic);
            allTeachers.add(teacher);
        }
        return allTeachers;
    }

   /* public static void main(String[] args) {
        ArrayList<Students> generatedStudents = generateStudents(5);
        for (Students student : generatedStudents) {
            System.out.println(student.getFullName());
        }

        ArrayList<Teachers> generatedTeachers = generateTeachers(4);
        for (Teachers teacher : generatedTeachers) {
            System.out.println(teacher.getFullName());
        }
    }*/
}