package ch.yves.ex;

public class Collatz {

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static int collatzIterative(int n) {
        return collatzIterative(n, 0);
    }

    private static int collatzIterative(int n, int steps) {
        if (n <= 0) {
            throw new RuntimeException("n must be greater than 0!");
        }

        while (n > 1) {
            n = isEven(n) ? n / 2 : 3 * n + 1;

            steps++;
        }

        return steps;
    }

    private static int collatzRecursive(int n) {
        return collatzRecursive(n, 0);
    }

    private static int collatzRecursive(int n, int steps) {
        if (n <= 0) {
            throw new RuntimeException("n must be greater than 0!");
        } else if (n == 1) {
            return steps;
        }

        return collatzRecursive(isEven(n) ? n / 2 : 3 * n + 1, steps + 1);
    }

    public static void main(String[] args) {
        int sampleNumber = 19;

        // amount of steps
        System.out.println();
        System.out.println("Collatz steps iterative: " + collatzIterative(sampleNumber));
        System.out.println("Collatz steps recursive: " + collatzRecursive(sampleNumber));

        // amount of numbers
        System.out.println();
        System.out.println("Collatz numbers iterative: " + collatzIterative(sampleNumber, 1));
        System.out.println("Collatz numbers recursive: " + collatzRecursive(sampleNumber, 1));
    }
}
