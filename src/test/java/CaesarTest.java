import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest{

    @Test 

    public void isAlphabets_inputOnlyStrings_true(){
        Caesar caesar = new Caesar();
        assertEquals(true, caesar.isAlphabets("text"));
    }

    @Test 

    public void isAlphabets_inputNotNull_true(){
        Caesar caesar = new Caesar();
        assertEquals(true,caesar.isAlphabets("text"));
    }
}