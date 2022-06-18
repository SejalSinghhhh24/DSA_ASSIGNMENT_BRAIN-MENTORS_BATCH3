Given an Array and we need to find the element of the array are sorted or not?
Code:

public class arraySorted {
    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 6, 8 };
        boolean w = sorted(a, a.length);
        if (w)
            System.out.println(" sorted");
        else
            System.out.println("not sorted");
    }

    static boolean sorted(int[] a, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        if (a[n - 1] < a[n - 2]) {
            return false;
        }
        return sorted(a, n - 1);
    }
}
