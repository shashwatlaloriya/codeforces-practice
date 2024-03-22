import java.util.*;

class cd1914B {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        for (int x=0; x<s; x++)
        {
            int n=sc.nextInt();
            sc.nextInt();
            int k=sc.nextInt();
            int[] ar;
            ar = new int [n];
            int []ar2;
            ar2= new int [k];
            for (int i=n-1; i>0; i--) {
                ar[i]=i+1;
            }
            if(k==0)
            {
                for (int i=n; i>=1; i--)
                    System.out.println(i);
            }
            else
            {
                int a=n-(k+1);
                for (int j=0; j<a; j++)
                    ar2[j]=ar[j];
                for(int g=n-1; g<=a; g++)
                    ar2[a]=ar[g];
            }
            for (int i=1; i<n; i++)
                System.out.println(ar2[i]);




        }





    }
}