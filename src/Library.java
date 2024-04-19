import java.util.ArrayList;

public class Library {

        private ArrayList<String> library = new ArrayList<>();

        public ArrayList<String> getLibrary() {
                return library;
        }

        public Library() {
                createBooks();
                printLibrary();
        }

        private void createBooks() {
                createFictionBooks(2, "Russian");
                createEducationalBooks(2, "Russian");
                createFictionBooks(2, "English");
                createEducationalBooks(2, "English");
        }

        private void createEducationalBooks(int numberOfBooks, String bookType) {
                BooksFactory educatedFactory = new EducationalFactory();

                for (int i = 0; i < numberOfBooks; i++) {
                        switch (bookType) {
                                case "Russian":
                                        RussianEducational russianEducational = (RussianEducational) educatedFactory.createRusBook();
                                        library.add(russianEducational.getFullBookTitle());
                                        break;
                                case "English":
                                        EnglishEducational englishEducational = (EnglishEducational) educatedFactory.createEngBook();
                                        library.add(englishEducational.getFullBookTitle());
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
                                        library.add(russianFiction.getFullBookTitle());
                                        break;
                                case "English":
                                        EnglishFiction englishFiction = (EnglishFiction) fictionFactory.createEngBook();
                                        library.add(englishFiction.getFullBookTitle());
                                        break;
                                default:
                                        System.out.println("Unsupported book type");
                                        break;
                        }
                }
        }

        private void printLibrary() {
                for (String book : library) {
                        System.out.println(book);
                }
        }
}