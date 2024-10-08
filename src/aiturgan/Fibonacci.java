package aiturgan;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println(fibonacciRecursive(9));
        System.out.println(fibonacci(13));
        System.out.println(fibonacciRecursive(23));

    }
    public static int fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
/*
        Fibonacci

        Create a method that will give you the Nth Fibonacci number where N is the given int parameter.
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        parameter: int
        return: int

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */