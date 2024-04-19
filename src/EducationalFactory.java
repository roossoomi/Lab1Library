public class EducationalFactory implements BooksFactory {
    @Override
    public RussianBook createRusBook() {
        return new RussianEducational();
    }
@Override
    public EnglishBook createEngBook() {
        return new EnglishEducational();
    }
}