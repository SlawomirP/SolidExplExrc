package SOLIDS;

public class MainForTests {
    public static void main(String[] args) {
        AddPrefixToBookAuthor zmieniacz = new AddPrefixToBookAuthor();


        Book book = new Book("krzyzaki", "sienkiewicz", "kill them all");

        String nowyAutor = zmieniacz.addPrefixToBookAuthor("mr", book.getAuthor());
        System.out.println(nowyAutor);

    }
}
