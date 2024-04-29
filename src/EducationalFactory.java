import bookPackage.Book;

import java.util.Random;

public class EducationalFactory implements BooksFactory {
    @Override
    public Book createRusBook() {
        Random random = new Random();
        int index = random.nextInt(RussianEducational.getDisciplineList().length);
        int indexx = random.nextInt(RussianEducational.getAuthorList().length);
        int indexxx = random.nextInt(RussianEducational.getLiteratureTypeList().length);
        String title = RussianEducational.getDisciplineList()[index] + " " + RussianEducational.getAuthorList()[indexx] + " " + RussianEducational.getLiteratureTypeList()[indexxx];
        RussianEducational russianEducational = new RussianEducational(title);
        return russianEducational;


    }

    @Override
    public Book createEngBook() {
        Random random = new Random();
        String literatureLevel;
        if (random.nextBoolean()) {
            literatureLevel = "Bachelor";
        } else {
            literatureLevel = "Magistracy";
        }
        int index = random.nextInt(EnglishEducational.getAuthorList().length);
        int indexx = random.nextInt(EnglishEducational.getDisciplineList().length);
        int indexxx = random.nextInt(EnglishEducational.getUniverstyList().length);
        String title = EnglishEducational.getDisciplineList()[indexx] + " " + EnglishEducational.getAuthorList()[index] + " " + EnglishEducational.getUniverstyList()[indexxx] + " " + literatureLevel;
        EnglishEducational englishEducational = new EnglishEducational(title);
        return englishEducational;
    }
}