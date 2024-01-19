#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n;
	int p;
	scanf("%d",&n);
	while(n!=0)
	{
	scanf("%d",&p);
	int s[p];
	int e[p];
	for(int x=0;x<p;x++)
	{
		scanf("%d",&s[x]);
		scanf("%d\n",&e[x]);
	}
	for(int x=1;x<p;x++)
	{	
		int mono=s[0];
		if(s[x]>=mono)
		{	
			if(e[x]>=mono)
			{
			printf("-1");
			return 0;
			}
		}
	}
	int w=1;
	
	while(w<s[0])
	w++;
	
	for(int x=1;x<p;x++)
	{	
		if(s[x]>w)
		{
			if(e[x]>e[0])
			printf("-1");
			return 0;
		}
			
	}
	printf("%d",w);
	n--;							
}
}



