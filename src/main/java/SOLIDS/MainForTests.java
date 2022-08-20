package SOLIDS;

public class MainForTests {
    public static void main(String[] args) {


        Book book = new Book("krzyzaki", "sienkiewicz", "kill them all");

        String newAuthor = AddPrefixToBookAuthor.addPrefixToBookAuthor("mr", book.getAuthor());

        System.out.println(newAuthor);
    }
}
