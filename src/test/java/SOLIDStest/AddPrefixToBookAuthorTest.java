package SOLIDStest;

import SOLIDS.AddPrefixToBookAuthor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddPrefixToBookAuthorTest {

    @Test
    public void shouldReturnBookAuthorWithPrefix(){
        //given
        AddPrefixToBookAuthor addPrefixToBookAuthor = new AddPrefixToBookAuthor();
        //when
        String effect = addPrefixToBookAuthor.addPrefixToBookAuthor("mr", "john" );
        //then
        Assertions.assertEquals("mr john", effect );
    }

}