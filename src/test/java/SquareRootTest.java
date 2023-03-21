import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootTest {
    @BeforeClass
    public static void before_test() {
        System.out.println("===============================================");
        System.out.println("starting square root test");
        System.out.println("===============================================");
    }

    @Test
    public void positive_float() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) square root +ve");
        assertEquals("square root 25 not working correctly",5,mycalc.square_root(25),0.00001);
    }
}
