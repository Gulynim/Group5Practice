package barno;

public class Fibonachi {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));

    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}

