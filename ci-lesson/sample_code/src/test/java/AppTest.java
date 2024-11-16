import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        // Testing the add method
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testAddWithNegatives() {
        // Testing the add method with negative numbers
        assertEquals(-1, App.add(2, -3), "2 + (-3) should equal -1");
    }

    @Test
    public void testAddWithZero() {
        // Testing the add method with zero
        assertEquals(2, App.add(2, 0), "2 + 0 should equal 2");
    }
}

