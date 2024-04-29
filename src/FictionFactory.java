import bookPackage.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FictionFactory implements BooksFactory {
    @Override
    public Book createRusBook() {
        String RusfilePath = "RussianFiction.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(RusfilePath))) {

            int numberOfLines = 0;
            while (br.readLine() != null) {
                numberOfLines++;
            }

            Random random = new Random();
            int randomLineNumber = random.nextInt(numberOfLines) + 1;
            br.close();
            BufferedReader fr = new BufferedReader(new FileReader(RusfilePath));
            for (int i = 1; i < randomLineNumber; i++) {
                fr.readLine();
            }
            String title = fr.readLine();
            RussianFiction russianFiction = new RussianFiction(title);
            return russianFiction;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Book createEngBook() {
        String EngFullPath = "EnglishFiction.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(EngFullPath))) {
            int numberOfLines = 0;
            while (br.readLine() != null) {
                numberOfLines++;
            }
            Random random = new Random();
            int randomLineNumber = random.nextInt(numberOfLines) + 1;
            br.close();
            BufferedReader fr = new BufferedReader(new FileReader(EngFullPath));
            for (int i = 1; i < randomLineNumber; i++) {
                fr.readLine();
            }
            String title = fr.readLine();
            EnglishFiction englishFiction = new EnglishFiction(title);
            return englishFiction;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}