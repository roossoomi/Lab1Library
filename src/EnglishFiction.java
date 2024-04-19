
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class EnglishFiction extends Book implements EnglishBook  {
    public static String title;
    private static String filePath = "C:\\Users\\sonya\\IdeaProjects\\Lab1Library\\src\\EnglishFiction.txt";



    public static String createRandomEngFic(String filePath) {
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
            return fr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String getFullBookTitle() {

        return createRandomEngFic( filePath);
    }


}