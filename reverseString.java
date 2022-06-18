Reverse a String e.g tim output : mit
CODE:

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        rev(n);

    }

    static void rev(String n) {
        if (n == null || n.length() <= 1) {
            System.out.print(n);
        } else {
            System.out.print(n.charAt(n.length() - 1));
            rev(n.substring(0, n.length() - 1));
        }

    }

}
