import java.util.*;

public class StackTest{
    public static void main(String args[]){
 
  Scanner in = new Scanner(System.in);
  Stack s = new Stack();
  char ch ;
do{
System.out.println("choose from the menu");
System.out.println("1. insert the integer");
System.out.println("2. delete the last integer");
System.out.println("3. Space left");
System.out.println("4. isEmpty");
System.out.println("5. isFull");
System.out.println("6. Display Stack");
int choice = in.nextInt();

switch(choice){

    case 1:

System.out.println("Enter the value to be pushed");
int x = in.nextInt();
    s.Push(x);
    break;
    case 2:
s.Pop();
break;

case 3:
 int spcLeft=s.SpaceLeft();
                System.out.println(spcLeft);
                break;


case 4 :

System.out.println(s.isEmpty());
break;
case 5:

System.out.println(s.isFull());
break;
case 6:
s.DisplayStack();
break;

 default: System.out.println("Invalid Choice");

}

System.out.println("if you want to continue press Y else N");
ch = in.next().charAt(0);
}while(ch=='Y');


    }
}