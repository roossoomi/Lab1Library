import bookPackage.Book;

import java.util.Random;

public class EnglishEducational extends Book implements EnglishBook {
    static String literatureLevel;
    String title;
    public final String[] disciplineList = {"Machine Learning", "Python for Data Science", "Financial Markets", "Creative Writing", "Digital Marketing", "Photography Basics", "Artificial Intelligence", "Graphic Design", "Entrepreneurship", "Psychology of Relationships", "Music Production", "Public Speaking Skills", "Leadership and Management", "Healthcare Administration", "Fashion Design", "Web Development", "Nutrition and Wellness", "Game Development", "Cryptocurrency and Blockchain", "Environmental Science"};
    public final String[] universtyList = {"University of Oxford", "University of Cambridge", "Imperial College London", "London School of Economics and Political Science", "University College London", "University of Edinburgh", "University of Manchester", "University of Bristol", "University of Warwick", "University of Glasgow"};
    public final String[] authorList = {"John Smith", "Emily Brown", "Michael Johnson", "Sarah Wilson", "David Thompson", "Jessica White", "Andrew Miller", "Laura Davis", "Mark Robinson", "Anna Martinez", "Chris Lee", "Emma Taylor", "Steven Harris", "Olivia Clark", "Peter Baker", "Rachel Young", "Kevin Wright", "Sophie Hall", "Daniel King", "Lucy Adams"};

    public String createRandomEngEd() {
        Random random = new Random();
        if (random.nextBoolean()) {
            literatureLevel = "Bachelor";
        } else {
            literatureLevel = "Magistracy";
        }
        int index = random.nextInt(disciplineList.length);
        int indexx = random.nextInt(authorList.length);
        int indexxx = random.nextInt(universtyList.length);
        this.title = disciplineList[index] + " " + authorList[indexx] + " " + universtyList[indexxx] + " " + literatureLevel;
        return title;
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
