package nphyle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void testIsValid() {
        int position = 10;

        boolean expected = true;
        boolean actual = App.IsValid(position);

        assertEquals(expected, actual);
    }

    @Test
    public void testRecursive() {
        int position = 10;

        int expected = 55;
        int actual = App.recursive(position);

        assertEquals(expected, actual);
    }
}
