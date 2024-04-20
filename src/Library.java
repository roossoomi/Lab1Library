import tvar.Book;

import java.util.ArrayList;

public class Library {

        private ArrayList<Book> library = new ArrayList<>();

        public ArrayList<Book> getLibrary() {
                return library;
        }

        public Library() {
                this.createBooks();
                //printLibrary();
        }

        private void createBooks() {
                createFictionBooks(10, "Russian");
                createEducationalBooks(10, "Russian");
                createFictionBooks(10, "English");
                createEducationalBooks(10, "English");
        }

        private void createEducationalBooks(int numberOfBooks, String bookType) {
                BooksFactory educatedFactory = new EducationalFactory();

                for (int i = 0; i < numberOfBooks; i++) {
                        switch (bookType) {
                                case "Russian":
                                        RussianEducational russianEducational = (RussianEducational) educatedFactory.createRusBook();
                                        library.add(russianEducational);
                                        System.out.println("ER");
                                        System.out.println(russianEducational.createRandomRusEd().toString());
                                        break;
                                case "English":
                                        EnglishEducational englishEducational = (EnglishEducational) educatedFactory.createEngBook();
                                        library.add(englishEducational);
                                        System.out.println("EE");
                                        System.out.println(englishEducational.createRandomEngEd());
                                        break;
                                default:
                                        System.out.println("Unsupported book type");
                                        break;
                        }
                }
        }

        private void createFictionBooks(int numberOfBooks, String bookType) {
                BooksFactory fictionFactory = new FictionFactory();

                for (int i = 0; i < numberOfBooks; i++) {
                        switch (bookType) {
                                case "Russian":
                                        RussianFiction russianFiction = (RussianFiction) fictionFactory.createRusBook();
                                        library.add(russianFiction);
                                        System.out.println("FR");
                                        russianFiction.createRandomRusFic();
                                        break;
                                case "English":
                                        EnglishFiction englishFiction = (EnglishFiction) fictionFactory.createEngBook();
                                        library.add(englishFiction);
                                        System.out.print("FE ");
                                        System.out.println(englishFiction.createRandomEngFic());
                                        break;
                                default:
                                        System.out.println("Unsupported book type");
                                        break;
                        }
                }
        }

        private void printLibrary() {
                for (Book book : library) {
                        System.out.println(book);
                }
        }
}