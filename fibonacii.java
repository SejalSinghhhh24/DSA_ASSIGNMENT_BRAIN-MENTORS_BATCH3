Print Fibonacii Series . e.g N = 10 
CODE:

import java.util.Scanner;

public class fibonacii {
    static int a = 0, b = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("0");
        System.out.println("1");
        fib(n - 2);

    }

    static void fib(int n) {
        if (n > 0) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            fib(n - 1);
        }
    }
}
