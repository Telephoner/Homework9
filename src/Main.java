public class Main {
    public static void main(String[] args) {
        Author witcherAuthor = new Author("Анджей", "Сапковский");
        Book witcher = new Book("The Witcher: The Last Wish", witcherAuthor.getName() + witcherAuthor.getSurname(), 1993);
        System.out.println("witcher = " + witcher);
        System.out.println("witcherAuthor = " + witcherAuthor);

    }
}