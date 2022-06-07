public class windowsliding_2 {
    public static void main(String[] args) {
        // Find the Frequency of Sum in given Sub Array of kth Size.
        int[] a = { 2, 0, 2, 2, 0, 2, 2 };
        int k = 3;
        int sum = 4;
        int s = 0, c = 0;
        for (int i = 0; i < k; i++) {
            s += a[i];

        }
        // System.out.println(s);
        if (s == sum) {
            c++;
        }
        for (int i = k; i < a.length; i++) {
            s = s - a[i - k] + a[i];
            if (s == sum) {
                c++;
            }

            // System.out.println(s);

        }

        System.out.println(c);
    }
}
