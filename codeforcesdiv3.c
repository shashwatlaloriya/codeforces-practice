/*#include<stdio.h>
#include<stdlib.h>
int numpad[10]={1,2,3,4,5,6,7,8,9,0};
int main()
{
int n;
scanf("%d",&n);
int pass[n];int x;
for(int x=0;x<n;x++)
{
	scanf("%d\n",&pass[x]);
}
for(int x=0;x<n;x++)
{
	int time=0;int a,b;int d[4];
	int check=pass[x];
	/*for(int y=0;y<10;y++)
	{
		
	}*\int factor=1;int temp=pass[x];
	
	while(temp)
	{
		temp=temp/10;
		factor=factor*10;
	}
	while(factor>1)
	{
		int x=0;
		factor=factor/10;
		 d[x]=(check/factor);
		 check=check%10;x++;
	}
	for(int x=0;x<5;x++)
	{
		for(int y=a;y<b;y++)
		{
			if(numpad[x]!=d[y])
			time++;
			else
			{
				time=time+2;
				if(d[x+1]<d[x])
				{
					a=0;b=d[x];
				}
				else
				{
					a=d[x];b=9;
				}
			}
		}
	}
	printf("%d",time);
}
}
*/
#include <stdio.h>
#include <math.h>
 
int main()
{
    int t, a, b, c, d, n, sec;
    scanf("%d", &t);
    while(t > 0) {
        scanf("%d", &n);
        a = n/1000;
        b = (n/100)%10;
        c = (n/10)%10;
        d = n%10;
        if(a == 0) a = 10;
        if(b == 0) b = 10;
        if(c == 0) c = 10;
        if(d == 0) d = 10;
        sec = 4+abs(a-1)+abs(b-a)+abs(c-b)+abs(d-c);
        printf("%d\n", sec);
        t--;
    }
    return 0;
}




