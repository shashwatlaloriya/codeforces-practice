import java.util.*;
public class DIV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        int n;
        String t;
        test = sc.nextInt();
        String[] res = new String[test];
        for (int x = 0; x < test; x++) {
            n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            t = sc.nextLine();
            if (a.equals(c)) {
                res[x] = "NO";
            } else {
                for (int z = 0; z < n; z++) {
                    int ch = t.charAt(z);

                    if (ch >= 65 && ch <= 90) {
                        int acheck = a.charAt(z);
                        int bcheck = b.charAt(z);
                        if (acheck == ch || bcheck == ch) {
                            res[x] = "NO";
                            break;
                        }
                    } else {
                        int ch1 = t.charAt(z);
                        int a1check = a.charAt(z);
                        int b1check = b.charAt(z);
                        if (a1check != ch1 || b1check != ch1) {
                            res[x] = "NO";
                            break;
                        }

                    }

                }
                res[x] = "Yes";
            }
            for (int i = 0; i < test; i++)
                System.out.println(res[i]);
        }
    }
}
