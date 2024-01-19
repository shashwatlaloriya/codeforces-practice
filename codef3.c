#include<stdio.h>
#include<stdlib.h>
int main()
{	
	int N;int small;
	
	scanf("%d",&N);
	int *ar;
	ar=malloc(sizeof(int)*N);
	for(int x=0;x<N;x++)
	{
		scanf("%d",&ar[x]);
	}
	for(int x=0;x<N;x++)
	{
		if(ar[x]<0)
		ar[x]=ar[x]*(-1);
	}
	small=ar[0];
	for(int x=1;x<N;x++)
	{	
    		if (ar[x] < small)
    		{
      		small = ar[x];
    		}
  	}
	
	printf("%d",small);
        }
        
