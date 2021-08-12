
package TPBank;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NguyenManhCuong
 */
public class TestAccountNumber {

    EBank eBank;

    public TestAccountNumber() {
        eBank = new EBank();
    }
    // Account number must is a number and must have 10 digits.
        
    // test accountnumber only have 1-10 digit
    @Test
    public void test1_AccountNumber() {
        String result = eBank.getAccountNumber("");
        String expected = "invalid";
        assertEquals(expected, result);
    }
     @Test
    public void test2_AccountNumber() {
        String result = eBank.getAccountNumber("1");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test3_AccountNumber() {
        String result = eBank.getAccountNumber("12345678910");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test4_AccountNumber() {
        String result = eBank.getAccountNumber("aaaaaaaaaa");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test5_AccountNumber() {
        String result = eBank.getAccountNumber("123456");
        String expected = "invalid";
        assertEquals(expected, result);
    }
    public void test6_AccountNumber() {
        String result = eBank.getAccountNumber("0123456123");
        String expected = "0123456123";
        assertEquals(expected, result);
    }
    
    
    
}
