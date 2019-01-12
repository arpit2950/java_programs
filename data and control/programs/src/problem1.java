import java.util.*;

public class problem1 {
	public static void main(String[]args) {
   Scanner a = new Scanner(System.in);
   System.out.println("Enter the two numbers");
   int x = a.nextInt();
   int y = a.nextInt();
   
   System.out.println("The addition of "+ x + " and "+ y +" is "+ (x+y) +"");

   System.out.println("The subtraction of "+ x + " and "+ y +" is "+ (x-y) +"");

   System.out.println("The multipication of "+ x + " and "+ y +" is "+ (x*y) +"");

   System.out.println("The division of "+ x + " and "+ y +" is "+ (x/y) +"");

   System.out.println("The modulus of "+ x + " and "+ y +" is "+ (x%y) +"");
	}
}