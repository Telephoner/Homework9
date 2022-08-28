public class Main {

    public static void main(String[] args) {
        Author witcherAuthor = new Author("Анджей", "Сапковский");
        Book witcher = new Book("Ведьмак: Последнее желание", witcherAuthor.getName() + " " + witcherAuthor.getSurname(), 1993);

        System.out.println(witcher.getTitle()+" "+witcher.getReleaseYear()+ " " + witcher.getAuthor());


    }
}