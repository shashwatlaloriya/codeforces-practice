#include <stdio.h>
#include <stdlib.h>

typedef struct queue {
  int *data;
  int front;
  int rear;
  int capacity;
} Queue;

Queue *createQueue(int capacity) {
  Queue *queue = (Queue *)malloc(sizeof(Queue));
  queue->data = (int *)malloc(sizeof(int) * capacity);
  queue->front = -1;
  queue->rear = -1;
  queue->capacity = capacity;
  return queue;
}

void enqueue(Queue *queue, int data) {
  if (queue->rear == queue->capacity - 1) {
    printf("Queue is full\n");
    return;
  }

  queue->rear++;
  queue->data[queue->rear] = data;
}

int dequeue(Queue *queue) {
  if (queue->front == queue->rear) {
    printf("Queue is empty\n");
    return -1;
  }

  queue->front++;
  int data = queue->data[queue->front];
  return data;
}

int isEmpty(Queue *queue) {
  return queue->front == queue->rear;
}

typedef struct stack {
  Queue *queue1;
  Queue *queue2;
} Stack;

Stack *createStack() {
  Stack *stack = (Stack *)malloc(sizeof(Stack));
  stack->queue1 = createQueue(100);
  stack->queue2 = createQueue(100);
  return stack;
}

void push(Stack *stack, int data) {
  enqueue(stack->queue1, data);
}

int pop(Stack *stack) {
  if (isEmpty(stack->queue1)) {
    printf("Stack is empty\n");
    return -1;
  }

  while (stack->queue1->front != stack->queue1->rear) {
    enqueue(stack->queue2, dequeue(stack->queue1));
  }

  int data = dequeue(stack->queue1);

  while (stack->queue2->front != stack->queue2->rear) {
    enqueue(stack->queue1, dequeue(stack->queue2));
  }

  return data;
}

int main() {
  Stack *stack = createStack();
printf("1-push\n2-pop\n3-exit\n");
	while(1){
	printf("enter your choice:\n");
	int n;
	scanf("%d",&n);
	if(n==1){
	int data;
	scanf("%d",&data);
	push(stack,data);}
	else if(n==2)
	 printf("Popped element: %d\n", pop(stack));
	else
	return 0;

}

}

