import java.util.*;
 class div3mar11 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         sc.nextLine();
         int ans[] = new int[t];
         for (int x = 0; x < t; x++) {
             int n = sc.nextInt();
             sc.nextLine();
             String s = sc.nextLine();

             int l = s.length();
             if (l == n) {
                 int c = 0;
                 for (int y = 0; y < l - 2; y++) {
                     if ((s.charAt(y) == 'p' && s.charAt(y + 1) == 'i' && s.charAt(y + 2) == 'e') || (s.charAt(y) == 'm' && s.charAt(y + 1) == 'a' && s.charAt(y + 2) == 'p') ){
                         c++;
                         y = y + 2;
                     }
                 }
                 ans[x] = c;
             }
         }
             for (int x = 0; x < t; x++)
                 System.out.println(ans[x]);

         }
     }
