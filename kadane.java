import java.util.Scanner;

public class kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0, m = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            c += a[i];

            if (c < 0) {
                c = 0;
            }
            m = c > m ? c : m;
        }
        System.out.println(m);
        sc.close();
    }

}
