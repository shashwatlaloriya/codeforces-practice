import java.util.*;
class First
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        if((a>0&&a<11)&&(b>0&&b<11))
        {
            if(a!=b)
            {
                int chef = a*c;
                int chefina=b*c;
                if(chef>chefina)
                    System.out.println(chef);
                else
                    System.out.println(chefina);
            }
        }

    }
}
