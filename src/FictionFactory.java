public class FictionFactory implements BooksFactory {
    @Override
    public RussianBook createRusBook() {
        return new RussianFiction();
    }

    @Override
    public EnglishBook createEngBook() {
        return new EnglishFiction();
    }
}
