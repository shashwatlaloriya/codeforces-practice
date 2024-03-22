import java.util.*;
public class Div41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        if (t >= 1 && t <= 100) {
            String ans[] = new String[t];
            for (int x = 0; x < t; x++) {
                int n = sc.nextInt();
                int ar[][] = new int[n][n];
                if (n > 1 && n <= 10) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            ar[i][j] = sc.nextInt();
                        }
                    }
                    int cnew = 1;
                    int cold = 0;
                    for (int i = 0; i < n-1; i++) {
                        for (int j = 0; j < n; j++) {
                            if (ar[i][j] == 1) {
                                cold ++;
                            }
                            if (ar[i + 1][j] == 1)
                                cnew++;
                        }
                        if (cnew == cold)
                            ans[x] = "SQUARE";
                        else
                            ans[x] = "Triangle";
                    }
                }
            }
            for (int x = 0; x < t; x++)
                System.out.println(ans[x]);
        }
    }
}
