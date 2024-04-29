import bookPackage.Book;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<>();

    public ArrayList<Book> getLibrary() {

        return library;
    }

    public Library() {
        this.createBooks();
    }

    private void createBooks() {
        createFictionBooks(25, "Russian");
        createEducationalBooks(25, "Russian");
        createFictionBooks(25, "English");
        createEducationalBooks(25, "English");
    }

    private void createEducationalBooks(int numberOfBooks, String bookType) {
        BooksFactory educatedFactory = new EducationalFactory();
        for (int i = 0; i < numberOfBooks; i++) {
            if (bookType == "Russian") {
                RussianEducational russianEducational = (RussianEducational) educatedFactory.createRusBook();
                library.add(russianEducational);
            } else {
                EnglishEducational englishEducational = (EnglishEducational) educatedFactory.createEngBook();
                library.add(englishEducational);

            }
        }
    }


    private void createFictionBooks(int numberOfBooks, String bookType) {
        BooksFactory fictionFactory = new FictionFactory();
        for (int i = 0; i < numberOfBooks; i++) {
            if (bookType == "Russian") {
                RussianFiction russianFiction = (RussianFiction) fictionFactory.createRusBook();
                library.add(russianFiction);
            } else {
                EnglishFiction englishFiction = (EnglishFiction) fictionFactory.createEngBook();
                library.add(englishFiction);

            }
        }


    }

}