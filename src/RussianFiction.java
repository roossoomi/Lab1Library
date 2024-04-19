
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RussianFiction extends Book implements RussianBook {
    public static String title;
    private static String filePath = "C:\\Users\\sonya\\IdeaProjects\\Lab1Library\\src\\RussianFiction.txt";

    public static String createRandomRusFic(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            int numberOfLines = 0;
            while (br.readLine() != null) {
                numberOfLines++;
            }

            Random random = new Random();
            int randomLineNumber = random.nextInt(numberOfLines) + 1;


            br.close();
            BufferedReader fr = new BufferedReader(new FileReader(filePath));


            for (int i = 1; i < randomLineNumber; i++) {
                fr.readLine();
            }

            title = fr.readLine();
            return title;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String getFullBookTitle() {
        return createRandomRusFic(filePath);
    }


}