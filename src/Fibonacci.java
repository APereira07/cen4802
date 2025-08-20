/**
 * A utility class for computing Fibonacci numbers.
 */
public class Fibonacci {

    /**
     * Computes the nth term of the Fibonacci sequence using recursion.
     *
     * @param n the position in the Fibonacci sequence (0-based index)
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");

        // Added a comment to demonstrate branch changes for assignment
    }
}
