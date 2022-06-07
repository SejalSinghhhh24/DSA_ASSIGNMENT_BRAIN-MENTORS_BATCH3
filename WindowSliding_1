public class windowsliding {
    public static void main(String[] args) {
        int[] a = { 1, 0, 3, 2, 1 };
        int k = 3;
        int sum = 4;
        int s = 0;
        for (int i = 0; i < k; i++) {
            s += a[i];

        }
        // System.out.println(s);
        if (s == sum)
            System.out.println("0" + " " + (k - 1));
        else {
            for (int i = k; i < a.length; i++) {
                s = s - a[i - k] + a[i];
                // System.out.println(s);
                if (s == sum) {
                    System.out.println((i - 2) + " " + (i));
                    break;
                }

            }
        }

    }
}
