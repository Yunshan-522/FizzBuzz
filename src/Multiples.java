public class Multiples {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i < 1000; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            boolean divisibleBy6 = i % 6 == 0;
            boolean divisibleBy9 = i % 9 == 0;

            if (divisibleBy3 || divisibleBy5 || divisibleBy6 || divisibleBy9) {
                number += 1;
            }
        }
        System.out.println(number);
    }
}
