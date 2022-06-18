WAP Count Number of Zero Digit in a given number e.g 1209803 Result 2
  
CODE:

import java.util.Scanner;

public class NoOfZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = zeros(n);
        System.out.println(r);
    }

    static int zeros(int n) {
        int c = 0;
        if (n == 0)
            return 0;
        if (n % 10 == 0) {
            c++;
            return c + zeros(n / 10);
        }
        return zeros(n / 10);

    }

}
//this logic is for the non zero input
