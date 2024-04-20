import tvar.Book;

import java.util.Random;

public class RussianEducational extends Book implements RussianBook {
    String discipline;
    String literatureType;
    String author;
    String title;
    //int pages;
public static final String[] disciplineList = {"Линейная алгебра", "Аналитическая геометрия", "Математическая статистика", "Экономико-математическое моделирование", "Экономичсекая история", "Микроэкономика", "Международные финансы", "Базы данных"};
private static final String[] literatureTypeList = {"Учебник", "Рабочая тетрадь", "Дидактические материалы", "Сборник задач", "Учебное пособие"};
    private static final String[] authorList = {"Клетеник Д. В.", "Демидович Б. П.", "Фомин О.Ю.", "Парфёнова М. Д", "Сандаков Е. Б.", "Горячев А. П."};
    public String getDiscipline(){
        return this.discipline;
    }
    public String getLiteratureType(){
        return this.literatureType;
    }
    public String getAuthor(){
        return this.author;
    }

    public  String createRandomRusEd(){
        Random random = new Random();
        int index = random.nextInt(disciplineList.length);
        int indexx = random.nextInt(authorList.length);
        int indexxx = random.nextInt(literatureTypeList.length);
        this.title =  disciplineList[index] + " " + authorList[indexx]+ " " + literatureTypeList[indexxx];
        return title;}

   /* @Override
    public Book getFullBookTitle() {

       return createRandomRusEd();
    }*/

    public String GetFullDiscription() {
        String FullTitle = this.title;
        return FullTitle;
    }
    @Override
    public String toString(){
        return GetFullDiscription();
    }



}
