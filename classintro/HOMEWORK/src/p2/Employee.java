class Employee{
	String first_name;
	String last_name;
	double monthly_salary;
	Adress add;


Employee(String x,String y,double z, String l1 , String l2, long p){

	first_name = x;
	last_name = y;
	monthly_salary = z ;
	 add = new Adress (l1,l2, p) ;
}
double YearlySalary()
{
	return (12*this.monthly_salary);

}
double Raise(){
	return (0.10*this.YearlySalary()+this.YearlySalary());

}
void display(){
	System.out.println("first name :"+this.first_name+"\n last name : "+this.last_name+"\nYearly Salary(before raise) "+this.YearlySalary()+"\n Yearly Salary(after raise)"+this.Raise()+" ");
  System.out.println("Adress : line1 "+this.add.line1+" line2 "+this.add.line2+" pincode "+this.add.pincode+" ");
}
}