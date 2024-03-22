import java.util.*;
public class cf4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 100 && x > 0) {
            if (x % 2 == 0&&x!=2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}