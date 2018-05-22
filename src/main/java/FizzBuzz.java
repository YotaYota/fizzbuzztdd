import joptsimple.internal.Objects;

public class FizzBuzz {

    public final String fizzBuzz;

    public static FizzBuzz generateFizzBuzz(String value) {
        return new FizzBuzz(value);
    }

    public FizzBuzz(String value) {
        isValidInput(value);
        this.fizzBuzz = value;
    }

    private String isValidInput(String value) throws NullPointerException, IllegalArgumentException, NumberFormatException {
        Objects.ensureNotNull(value);
        if (value == "Fizz" || value == "Buzz" || value == "FizzBuzz")
            return value;
        Integer.parseInt(value);
        return value;
    }

}
