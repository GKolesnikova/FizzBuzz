public class fizzbuzz {


    public static String fizzBuzz(int number) {
        if (number == 3) {
            return "fizz";
        } else if (number == 5) {
            return "buzz";
        } else if (number == 15) {
            return "fizzbuzz";
        } else {
            return String.valueOf(number);
        }


    }
}
