import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSetByName = new TreeSet<>();

        bookSetByName.add(new Book("Dava", 300, "Franz Kafka", "2022-01-15"));
        bookSetByName.add(new Book("Bir Delinin Hatıra Defteri", 250, "Nikolay Gogol",
                "2021-05-10"));
        bookSetByName.add(new Book("İnsan Ne İle Yaşar", 400, "Tolstoy",
                "2023-03-20"));
        bookSetByName.add(new Book("Mutluluk", 350, "Zülfü Livaneli", "2022-11-02"));
        bookSetByName.add(new Book("Fareler ve İnsanlar", 280, "John Steinbeck",
                "2020-08-18"));

        System.out.println("Books sorted by name:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

    }
}