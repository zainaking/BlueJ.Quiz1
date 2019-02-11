
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsGetLastWordTest {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }

    @Test
    public void test1(){
        // Given
        String sentence = "We assume chemical evolution is a sufficient explanation.";
        String expected = null;

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // Given
        String sentence = "What is meant by 'irreducible complexity'?";
        String expected = null;

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        String sentence = "quantum information conservation";
        String expected = null;

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        // Given
        String sentence = "The universe yields geometries so elegant, they animate with intelligence.";
        String expected = null;

        // When
        String actual = utilities.getLastWord(sentence);

        // Then
        assertEquals(expected, actual);
    }
}
