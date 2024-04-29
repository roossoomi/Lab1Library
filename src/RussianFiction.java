
import bookPackage.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RussianFiction extends Book {
    public static String title;

    public RussianFiction(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return GetFullDiscription();
    }


    public String GetFullDiscription() {
        String FullTitle = this.title;
        return FullTitle;
    }
}