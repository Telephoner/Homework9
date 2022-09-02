public class Main {

    public static void main(String[] args) {
        Author witcherAuthor = new Author("Анджей", "Сапковский");
        Author bookThiefAuthor = new Author("Маркус", "Зусак");
        Book witcher = new Book("Ведьмак: Последнее желание", witcherAuthor, 1993);
        Book bookThief = new Book("Книжный вор", bookThiefAuthor, 2005);

        System.out.println(witcher.getTitle() + " " + witcher.getReleaseYear() + " " + witcher.getAuthor());
        System.out.println(bookThief.getTitle() + " " + bookThief.getReleaseYear() + " " + bookThief.getAuthor());
        witcher.setReleaseYear(2017);
        System.out.println("witcher.getReleaseYear() = " + witcher.getReleaseYear());

    }
}