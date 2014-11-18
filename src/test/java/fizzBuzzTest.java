import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class fizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before

    public void startUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test public void isDivisibleByThree() {
        assertTrue(fizzBuzz.isDivisibleByThree(3));
    }

    @Test public void isNotDivisibleByThree() {
        assertFalse(fizzBuzz.isDivisibleByThree(5));
    }

    @Test public void isDivisibleByFive() {
        assertTrue(fizzBuzz.isDivisibleByFive(5));
    }

    @Test public void isNotDivisibleByFive() {
        assertFalse(fizzBuzz.isDivisibleByFive(6));
    }

    @Test public void isDivisibleByFifteen() {
        assertTrue(fizzBuzz.isDivisibleByFifteen(15));
    }

    @Test public void isNotDivisibleByFifteen() {
        assertFalse(fizzBuzz.isDivisibleByFifteen(17));
    }

    @Test public void returnsFizzWhenDivisibleByThree() {
        assertEquals(fizzBuzz.says(3), "Fizz");
    }

    @Test public void returnsBuzzWhenDivisibleByFive() {
        assertEquals(fizzBuzz.says(5), "Buzz");
    }

    @Test public void returnsFizzBuzzWhenDivisibleByFifteen() {
        assertEquals(fizzBuzz.says(15), "FizzBuzz");
    }

    @Test public void returnsNumberWhenNotDivisibleByNumbers() {
        assertEquals(fizzBuzz.says(1), "1");
    }
}
