import java.util.Scanner;

public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        int m = 0, c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        p[0] = a[0];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c = i == 0 ? p[j] : p[j] - p[i - 1];
                if (c > m) {
                    m = c;
                }
            }
        }
        System.out.println(m);
        sc.close();

    }
}
