import java.util.*;

class EmployeeTest{

	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the details of employee");
       String x = in.nextLine();
	       String y = in.nextLine();
	              double z  = in.nextDouble();
	              in.nextLine();//doubt
	                 String l1 = in.nextLine();
	                    String l2 =in.nextLine();
	                       long p = in.nextLong();
Employee e2 = new Employee( x, y, z, l1, l2,  p);
e2.display();

	}
}