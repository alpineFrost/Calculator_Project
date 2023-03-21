import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");

        System.out.println("starting power test");
        System.out.println("===============================================");
    }

    @Test
    public void positive_and_positive() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) power +ve and +ve integer numbers");
        assertEquals("power of 2 and 3 is not working correctly",8,mycalc.power(2f, 3f),0.00001);
    }
}
