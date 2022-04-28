import static org.junit.Assert.*;
import org.junit.*;


public class MyClassTest {
    @Test
    public void testLargerThanFive() {
        assertTrue(MyClass.largerThanFive(3));
    }

}
