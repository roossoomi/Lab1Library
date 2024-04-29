import bookPackage.Book;

import java.util.Random;

public class RussianEducational extends Book {

    String title;
    public RussianEducational(String title){
        this.title = title;
    }

    private static final String[] disciplineList = {"Линейная алгебра", "Аналитическая геометрия", "Математическая статистика", "Экономико-математическое моделирование", "Экономичсекая история", "Микроэкономика", "Международные финансы", "Базы данных"};
    private static final String[] literatureTypeList = {"Учебник", "Рабочая тетрадь", "Дидактические материалы", "Сборник задач", "Учебное пособие"};
    private static final String[] authorList = {"Клетеник Д. В.", "Демидович Б. П.", "Фомин О.Ю.", "Парфёнова М. Д", "Сандаков Е. Б.", "Горячев А. П."};

    public static String[] getAuthorList() {
        return authorList;
    }

    public static String[] getDisciplineList() {
        return disciplineList;
    }

    public static String[] getLiteratureTypeList() {
        return literatureTypeList;
    }


    public String GetFullDiscription() {
        String FullTitle = this.title;
        return FullTitle;
    }

    @Override
    public String toString() {
        return GetFullDiscription();
    }


}
