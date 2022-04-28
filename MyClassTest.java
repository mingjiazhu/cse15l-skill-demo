import static org.junit.Assert.*;
import org.junit.*;


public class MyClassTest {
    @Test
    public void testLargerThanFive() {
        assertFalse(MyClass.largerThanFive(3));
    }

}
