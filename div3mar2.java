import java.util.Scanner;

class div3mar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt();
            int[] ar = new int[n];

            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }

            if (tarray(ar)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean tarray(int[] ar) {
        int n = ar.length;

        for (int i = 1; i < n - 1; i++) {
            if (ar[i] >= 2 * ar[i - 1] && ar[i - 1] <= ar[i + 1]) {
                ar[i + 1] -= ar[i - 1];
                ar[i] -= 2 * ar[i - 1];
                ar[i - 1] = 0;
            }
        }
        for (int x : ar) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}
