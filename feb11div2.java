import java.util.*;
public class feb11div2 {
     public static String test(int a, int b) {
        if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && b / 2 == a) || (b % 2 != 0 && a / 2 == b) || (a == 1 && b == 1))
            return "NO";
        else
            return "YES";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > 0 && t <= 10000) {

            String ans[] = new String[t];
            for (int x = 0; x < t; x++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                ans[x] = test(a,b);
            }
            for (int y = 0; y < t; y++) {
                System.out.println(ans[y]);
            }
        }
    }
}

