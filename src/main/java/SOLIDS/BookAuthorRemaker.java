package SOLIDS;

public class BookAuthorRemaker {
    AddPrefixToBookAuthor addPrefixToBookAuthor;
    AddPostfixToBookAuthor addPostfixToBookAuthor;

    public BookAuthorRemaker(AddPrefixToBookAuthor addPrefixToBookAuthor, AddPostfixToBookAuthor addPostfixToBookAuthor) {
        this.addPrefixToBookAuthor = addPrefixToBookAuthor;
        this.addPostfixToBookAuthor = addPostfixToBookAuthor;
    }

    public String addPrefixPostfixToText(String prefix, String author, String postfix) {
        String textWithPrefix = addPrefixToBookAuthor.addPrefixToBookAuthor(prefix, author);
        String textWithPrefixAndPostfix = addPostfixToBookAuthor.addPostFixToBookAuthor(postfix, textWithPrefix);
        return textWithPrefixAndPostfix;
    }
}
