#include <stdio.h>
#include <stdlib.h>
struct stack{
int data;
struct stack *next;
}*top=NULL;

void push()
{	int data;
	printf("Enter number to push\n");
	scanf("%d",&data);
	struct stack *newnode;
	newnode=malloc(sizeof(struct stack));
	if(isFull(newnode)==1)
	{
		printf("Stack overflow\n");
		//exit(1);
	}
	else
	{	
		newnode->data=data;
		newnode->next=NULL;
	}
	if(top==NULL)
	{
		top=newnode;
	}
	else 
	{
		newnode->next=top;
		top=newnode;
	}
}
void pop()
{
	int data;struct stack *temp;
	if(isEmpty(top)==1)
	printf("Stack underflow");
	else
	{
		temp=top;
		data=temp->data;
		top=top->next;
		temp->next=NULL;
		free(temp);
		printf("%d\n",data);
	}
}
int isEmpty(struct stack *top)
{
	if(top==NULL)
	return 1;
	else 
	return 0;
}
int isFull(struct stack *newnode)
{
	if(newnode==NULL)
	return 1;
	else
	return 0;
}
void peek()
{
	int data;struct stack *temp;
	if(isEmpty(top==1))
	printf("Stack underflow");
	else
	{
	temp=top;
	data=temp->data;
	printf("%d\n",data);
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










