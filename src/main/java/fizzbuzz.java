public class fizzbuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else {
            return String.valueOf(number);
        }


    }
}
