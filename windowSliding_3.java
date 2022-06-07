import java.util.HashMap;

public class windowsliding_3 {
    public static void main(String[] args) {
        // Find the Frequency of an Element in Given kth Sub Array.
        int[] a = { 2, 0, 1, 1, 0, 2, 9, 2, 2, 2, 2 };
        int k = 3;
        int s = 2, c;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i <= a.length - k; i++) {
            int j = i;
            c = 0;
            while (j < i + k) {
                if (a[j] == s)
                    c++;
                j++;
            }
            h.put(i, c);
        }
        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.get(i));
        }
    }
}
