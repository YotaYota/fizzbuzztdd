public class FizzBuzzImpl {

    private String fizzBuzzOutputArray[] = new String[100];

    public static void main(String[] args) {
        FizzBuzzImpl fb = new FizzBuzzImpl();
        String[] fizzBuzzArray = fb.populateFizzBuzzArray();
        fb.printStringArray(fizzBuzzArray);
    }

    protected String[] populateFizzBuzzArray() {
        for (int i=1; i < 101; i++)
            fizzBuzzOutputArray[i-1] = getOutputString(i);
        return fizzBuzzOutputArray;
    }

    protected String getOutputString(int number) {
        FizzBuzz output;
        if (isDivisibleByFive(number) && isDivisibleByThree(number))
            output = FizzBuzz.generateFizzBuzz("FizzBuzz");
        else if (isDivisibleByThree(number))
            output = FizzBuzz.generateFizzBuzz("Fizz");
        else if (isDivisibleByFive(number))
            output = FizzBuzz.generateFizzBuzz("Buzz");
        else
            output = FizzBuzz.generateFizzBuzz(Integer.toString(number));
        return output.fizzBuzz;
    }

    protected boolean isDivisibleByThree(int number) {
        return (number % 3) == 0;
    }

    protected boolean isDivisibleByFive(int number) {
        return (number % 5) == 0;
    }

    private void printStringArray(String[] stringArray) {
        for (int i=0; i<stringArray.length; i++)
            System.out.println(stringArray[i]);
    }

    public String getFizzBuzzArrayIndex(int i) {
        return fizzBuzzOutputArray[i];
    }

}
