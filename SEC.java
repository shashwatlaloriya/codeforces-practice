/*import java.util.*;
import java.lang.*;
import java.io.*;

class SEC
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        if(t>0&&t<(Math.pow(10,5)))
        {
            for(int x=0;x<t;x++)
            {
                int n=sc.nextInt();int m=sc.nextInt();
                int a[]=new int[n];
                String s="";int c=0;
                for(int y=0;y<n;y++)
                    a[y]=sc.nextInt();
                for(int z=0;z<n-1;z++)
                {
                    if(a[z]<m)
                    {
                        if((a[z+1]+a[z])>m) {
                            c++;
                        }
                    }
                    else
                        c++;
                }
                int len=s.length();
                ans[x]=c;
            }
            for(int i=0;i<t;i++)
                System.out.println(ans[i]);
        }
    }
}*/
import java.util.*;

class SEC{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Handle special cases
            if (n == 2) {
                if (k == 1) {
                    System.out.println(1);
                } else if (k == 2) {
                    System.out.println(1 + " " + 2);
                } else {
                    System.out.println(-1); // No valid subset found
                }
                continue;
            } else if (k == 1) {
                int maxGcd = -1;
                int maxElement = -1;
                for (int num = 1; num <= n; num++) {
                    // Divide GCD by num to penalize larger elements for K=1 case
                    int currentGcd = n / gcd(num, n);
                    if (currentGcd > maxGcd) {
                        maxGcd = currentGcd;
                        maxElement = num;
                    }
                }
                if (maxGcd > 0) {
                    System.out.println(maxElement);
                } else {
                    System.out.println(-1); // No valid subset found
                }
                continue;
            }

            // Initialize variables
            List<Integer> maxSubset = null;

            // Find factors of n - 1 in decreasing order
            List<Integer> factors = new ArrayList<>();
            for (int j = n - 1; j >= 1; j--) {
                if (n % j == 0) {
                    factors.add(j);
                }
            }

            // Iterate through factors and find first valid subset
            for (int factor : factors) {
                List<Integer> subset = new ArrayList<>();
                int currentGcd = factor; // initial GCD is the factor itself

                for (int num = 1; num <= n; num++) { // Include N in the loop
                    if (num % factor == 0) {
                        currentGcd = gcd(currentGcd, num); // update GCD with each element
                        subset.add(num);

                        // Update maxSubset if K elements found or GCD already high enough
                        if (subset.size() == k || currentGcd > Math.min(n, (n - subset.size()) * (n - 2) / (k - 1))) {
                            maxSubset = new ArrayList<>(subset);
                            break; // stop building if K elements found or optimal GCD achieved
                        }
                    }
                }
            }

            // Print the subset with maximum GCD
            if (maxSubset != null) {
                for (int element : maxSubset) {
                    System.out.print(element + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1); // No valid subset found
            }
        }
    }

    // Function to calculate GCD of two numbers
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
