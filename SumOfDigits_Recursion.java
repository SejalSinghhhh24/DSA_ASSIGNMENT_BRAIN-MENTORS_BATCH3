WAP to do Sum of Digit. e.g num = 123 result = 6
  code:-
    
public class sum {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = sum1(n);
        System.out.println(r);

    }

    static int sum1(int n) {
        if (n == 0)
            return 0;
        int sr = sum1(n / 10);
        return n % 10 + sr;
    }

}
