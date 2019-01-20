import java.util.*;

class EmployeeTest1{

	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.display();
		
		System.out.println("Enter the details of employee");
       String x = in.nextLine();
	       String y = in.nextLine();
	              double z  = in.nextDouble();
Employee e2 = new Employee( x, y, z);
e2.display();

	}
}