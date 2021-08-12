package TPBank;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NguyenManhCuong
 */
public class TestPassWord {

    EBank eBank;

    public TestPassWord() {
        eBank = new EBank();
    }
    // Check length of the password which is enough length or not
    //Check the password which includes number and letter.
    // Password must be between 8 and 31 characters.
    
    
    // check enough length 8 and 31 characters or not
    @Test
    public void test7_TestPassWord() {
        String result = eBank.getPassowrd("cuong");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test8_TestPassWord() {
        String result = eBank.getPassowrd("manhcuong");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test9_TestPassWord() {
        String result = eBank.getPassowrd("manhcuongbn");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    //31 characters.
    public void test10_TestPassWord() {
        String result = eBank.getPassowrd("12345678901234567890123456789ab");
        String expected = "12345678901234567890123456789ab";
        assertEquals(expected, result);
    }
    
      //out of rank 31 characters.
    public void test11_TestPassWord() {
        String result = eBank.getPassowrd("12345678901234567890123456789abd");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    
    public void test12_TestPassWord() {
        String result = eBank.getPassowrd("manhcuong6");
        String expected = "manhcuong6";
        assertEquals(expected, result);
    }
}
