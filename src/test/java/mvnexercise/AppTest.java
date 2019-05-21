package mvnexercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    int a = 5, b = 5, c, expected;

    @Test
    public void testAddition() {
        c = a + b;
        expected = 10;
        assertEquals(expected, c);
    }

    @Test
    public void testSubtraction()
    {
    c=a-b;
    expected=0;

    assertEquals(expected, c);
}
}
