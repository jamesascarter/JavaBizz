/**
 * Created by jamescarter on 18/11/14.
 */
public class FizzBuzz {

    public boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }

    public boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    public boolean isDivisibleByFifteen(int i) {
        return i % 15 == 0;
    }

    public String says(int i) {
        if (isDivisibleByFifteen(i)) return "FizzBuzz";
        if (isDivisibleByThree(i)) return "Fizz";
        if (isDivisibleByFive(i)) return "Buzz";
        else return Integer.toString(i);

    }
}
