#include <stdio.h>
#include <stdlib.h>
int main() 
{
   int test;
   scanf("%d",&test);int n[test];
   for(int x=0;x<test;x++)
   {
   	scanf("%d",&n[x]);
   }
   for(int x=0;x<test;x++)
   {
        int num=n[x];
        int y;
        for(y=1;y<=10;y++)
        {
            if((num+1)%3==0||((num-1)%3==0))
            {
                printf("First\n");
                break;
            }
            else
            {
            printf("Second\n");
            break;
            }
        }
        if(y==10)
        printf("Second\n");
    }
    return 0;
}
