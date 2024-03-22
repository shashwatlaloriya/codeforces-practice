import java.util.Scanner;
public class encode1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int x = 1; x <= 6; x++) {
            if (x > b) {
                if (x >= a)
                    c++;
            }
        }
        if (c == 0) {
            System.out.println("0/1");
        } else if (c == 6) {
            System.out.println("1/1");
        } else {
            int num = c * (1 / 6);
            int den = c * (1 % 6);
            if (num == 0)
                num++;
            System.out.println(num + "/" + --den);
        }
    }
}
