public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int step = 0;
        while (n > 0) {
            boolean divisibleBy2 = n % 2 == 0;
            if (divisibleBy2) {
                n /= 2;
            } else {
                n -= 1;
            }
            step += 1;
        }
        System.out.println(step);
    }
}
