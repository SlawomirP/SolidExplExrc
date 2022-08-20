package SOLIDS;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Book {

    @Getter @Setter
    private String name;
    @Getter
    private String author;
    @Getter
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }
}
