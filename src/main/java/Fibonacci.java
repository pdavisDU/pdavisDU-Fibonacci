public class Fibonacci {
    /**
     * Return the nth number of the Fibonacci sequence.
     * The Fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next number.
     * The first two numbers in the whole Fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 1st number of the sequence would be 0, the 2nd number would be 1, the 3rd number would be 1, etc.
     *
     * @param n an iteration of the Fibonacci sequence (1-based).
     * @return the nth number of the Fibonacci sequence.
     */
    public int fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        if (n == 1 || n == 2) {
            return 1; // The first two numbers in the Fibonacci sequence are both 1
        } else {
            int a = 1;
            int b = 1;
            int result = 0;

            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }

            return result;
        }
    }
}
