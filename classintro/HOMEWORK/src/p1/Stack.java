class Stack{
int stack[] = new int[10];
int top_of_stack;

Stack()
{
    top_of_stack = -1;
}

void Push(int x){
    if(top_of_stack>=9){
        System.out.println("No space");
    }
        else{
         stack[++top_of_stack] = x ;
            System.out.println( x + "  pushed into the stack");
        }
    }
int Pop(){
            if(top_of_stack<0){
        System.out.println("Stack underflow");
        return 0 ;
    }
        else{
           int x = stack[top_of_stack--] ;
            System.out.println( x + "  poped out of the stack");
        return x ;
        }
    }

int SpaceLeft(){
    return (9-top_of_stack);

}
boolean isEmpty(){
   
   return (top_of_stack==-1);

}
boolean isFull(){
     return (top_of_stack==9) ;
        
}
void DisplayStack(){
    if(isEmpty())
    {
        System.out.println("Stack is Empty");
    }
    for(int i=0;i<(top_of_stack+1);i++)
    {
        System.out.println(stack[i]);
    }
}
}