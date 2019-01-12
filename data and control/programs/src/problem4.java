import java.util.*;

public class problem4 {
	public static void main(String[]args){

	Scanner a = new Scanner(System.in);
	System.out.println("Enter the value of x ");
	double x = a.nextDouble();
	System.out.println("Enter the terms");
	double y = a.nextDouble();
	double i , b ,d ;
	double f = 1.0 ;
	double sum = 1;

	for(i=1;i<=y;++i)
	{
	  
	   f = f * i ;
	   
       d = (x*i)/f;
       sum += Math.pow(x,i) / f ;
	}
  System.out.println("Answer is "+ sum);

	

	}
}