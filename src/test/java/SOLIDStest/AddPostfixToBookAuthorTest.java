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
        String effect = addPostfixToBookAuthor.addPostfixToBookAuthor("jr", "roberto");
        //then
        Assertions.assertEquals("roberto jr", effect );
    }

}