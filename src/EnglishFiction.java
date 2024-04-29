
import bookPackage.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class EnglishFiction extends Book {
    public static String title;

    public EnglishFiction(String title) {
        this.title = title;
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