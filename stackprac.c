#include <stdio.h>
#define MAX 5
int top=-1;
int stack[MAX];
int isEmpty()
{
	if(top==-1)
	return 1;
	else 
	return 0;
}
int isFull()
{
	if(top==MAX-1)
	return 1;
	else 
	return 0;
}
void push()
{
int data;
printf("Enter number to push\n");
scanf("%d",&data);
if(isFull()==1)
printf("Stack overflow\n");
else
{
	top+=1;
	stack[top]=data;
}
}
void pop()
{
	int data;
	if(isEmpty()==1)
	printf("stack underflow\n");
	else
	{
		data=stack[top];
		top-=1;
		printf("%d\n",data);
	}
}
void peek()
{
	int data;
	if(isEmpty()==1)
	printf("Stack Underflow");
	else
	{
		data=stack[top];
		printf("At top :%d\n",data);
	}
}
int main()
{
	while(1){
	printf("1-push\n2-pop\n3-peek\n4-exit\n");
	int n;
	scanf("%d",&n);
	if(n==1)
	push();
	else if(n==2)
	pop();
	else if(n==3)
	peek();
	else
	return 0;	
}
}




