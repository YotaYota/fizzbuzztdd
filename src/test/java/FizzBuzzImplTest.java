import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzImplTest {

    FizzBuzzImpl fb;

    @BeforeEach
    public void setUp() {
        fb = new FizzBuzzImpl();
    }

    @Test
    public void intNotDivisibleByThreeNorFivesShouldReturnNumberString() {
        String output = fb.getOutputString(11);
        assertEquals("11", output);
    }

    @Test
    public void intDivisibleByThreeButNotFiveShouldReturnFizz() {
        String output = fb.getOutputString(12);
        assertEquals("Fizz", output);
    }

    @Test
    public void intDivisibleByFiveButNotThreeShouldReturnBuzz() {
        String output = fb.getOutputString(20);
        assertEquals("Buzz", output);
    }

    @Test
    public void intDivisibleByBothThreeAndFiveShouldReturnFizzBuzz() {
        String output = fb.getOutputString(30);
        assertEquals("FizzBuzz", output);
    }

    @Test
    public void intDivisibeByThreeShouldReturnTrue() {
        assertTrue(fb.isDivisibleByThree(9));
    }

    @Test
    public void intNotDivisibeByThreeShouldReturnFalse() {
        assertFalse(fb.isDivisibleByThree(10));
    }

    @Test
    public void intDivisibleByFiveShouldReturnTrue() {
        assertTrue(fb.isDivisibleByFive(25));
    }

    @Test
    public void intNotDivisibleByFiveShouldReturnFalse() {
        assertFalse(fb.isDivisibleByFive(26));
    }

    @Test
    public void afterPopulateFifthShouldContainBuzz() {
        String[] stringArray = fb.populateFizzBuzzArray();
        assertEquals("Buzz", stringArray[4]);
    }

    @Test
    public void afterPopulateThityThirdShouldContainFizz() {
        fb.populateFizzBuzzArray();
        String fifthElementofArray = fb.getFizzBuzzArrayIndex(32);
        assertEquals("Fizz", fifthElementofArray);
    }

    @Test
    public void afterPopulateNintiethShouldContainFizzBuzz() {
        fb.populateFizzBuzzArray();
        String fifthElementofArray = fb.getFizzBuzzArrayIndex(89);
        assertEquals("FizzBuzz", fifthElementofArray);
    }

    @Test
    public void assertNumberFormatException() {
        assertThrows(NumberFormatException.class,
                () -> { FizzBuzz.generateFizzBuzz("IllegalArgument"); } );
    }

    @Test
    public void assertNullPointerException() {
        assertThrows(NullPointerException.class,
                () -> { FizzBuzz.generateFizzBuzz(null); } );
    }

    @Test
    public void shouldCreateWithArgumentFizz() {
        FizzBuzz fizzBuzz = FizzBuzz.generateFizzBuzz("Fizz");
        assertEquals("Fizz", fizzBuzz.fizzBuzz);
    }

    @Test
    public void shouldCreateWithArgumentBuzz() {
        FizzBuzz fizzBuzz = FizzBuzz.generateFizzBuzz("Buzz");
        assertEquals("Buzz", fizzBuzz.fizzBuzz);
    }

    @Test
    public void shouldCreateWithArgumentNumber() {
        FizzBuzz fizzBuzz = FizzBuzz.generateFizzBuzz("87");
        assertEquals("87", fizzBuzz.fizzBuzz);
    }
}