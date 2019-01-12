import java.util.*;

public class problem4{
	public static void main(String[]args){

      
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num;
		char ch;	// user input
		do{
		System.out.print("Enter a number with five digits: ");	// prompt
		num = input.nextInt();	// read five digits input
		
		// ensure input number with five digits
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.printf("%d ", (num / 10000));
		System.out.printf("%d ", (num / 1000) % 10);
		System.out.printf("%d ", (num / 100) % 10);
		System.out.printf("%d ", (num % 100) / 10);
		System.out.printf("%d\n ", (num % 10));
		}
		
		// if entered number more than five digits
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		// if entered number less than five digits
		if (num <= 9999) 
           System.out.println("You have entered less then five digit");

       System.out.println("If you want to quit press N and if you do not want to quit press any key exept N ");
       ch = input.next().charAt(0);
       }while(ch!='N');





}

}