import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f, m = 0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                f = 0;
                for (int k = i; k <= j; k++) {
                    f += a[k];
                    System.out.print(a[k] + " ");
                }
                if (f > m) {
                    m = f;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(m);
        sc.close();
    }
}
