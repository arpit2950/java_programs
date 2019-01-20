class Employee{
	String first_name;
	String last_name;
	double monthly_salary;
Employee(){
	first_name = "Arpit";
	last_name = " Sharma";
	monthly_salary = 100.0;

}
Employee(String x,String y,double z){

	first_name = x;
	last_name = y;
	monthly_salary = z ; 
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

}
}