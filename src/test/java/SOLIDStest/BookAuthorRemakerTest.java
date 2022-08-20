package SOLIDStest;

import SOLIDS.AddPostfixToBookAuthor;
import SOLIDS.AddPrefixToBookAuthor;
import SOLIDS.BookAuthorRemaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorRemakerTest {

    @Test
    public void shouldAddCorrectlyPrefixPostfixToAuthor(){
        //given
        AddPrefixToBookAuthor addPrefixToBookAuthor = new AddPrefixToBookAuthor();
        AddPostfixToBookAuthor addPostfixToBookAuthor = new AddPostfixToBookAuthor();
        BookAuthorRemaker bookAuthorRemaker = new BookAuthorRemaker(addPrefixToBookAuthor,addPostfixToBookAuthor);

        //when
        String result = bookAuthorRemaker.addPrefixPostfixToText("mr", "slawek", "jr");

        //then
        Assertions.assertEquals("mr slawek jr", result);

    }

}