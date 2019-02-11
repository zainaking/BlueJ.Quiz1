 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilitiesSquareTest {
    private MathUtilities utilities;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }

    @Test
    public void testSquareForBaseCase() {
        //Given
        int expected = 11;

        //When
        int actual = utilities.square(11);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSquareForOneDigit() {
        //Given
        int expected = 11;

        //When
        int actual = utilities.square(11);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSquareForTwoDigit() {
        //Given
        int expected = 11;

        //When
        int actual = utilities.square(11);

        //Then
        assertEquals(expected, actual);
    }
}
