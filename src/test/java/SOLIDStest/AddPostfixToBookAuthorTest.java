package SOLIDStest;

import SOLIDS.AddPostfixToBookAuthor;
import SOLIDS.AddPrefixToBookAuthor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddPostfixToBookAuthorTest {

    @Test
    public void shouldReturnBookAuthorWithPostfix(){
        //given
        AddPostfixToBookAuthor addPostfixToBookAuthor = new AddPostfixToBookAuthor();
        //when
        String textWithPostfix = addPostfixToBookAuthor.addPostFixToBookAuthor("jr", "slawek");
        //then
        Assertions.assertEquals("slawek jr", textWithPostfix);

    }

}