import java.util.*
class Student{
int Serial_No;
	 String First_Name;
	float cgpa ;
	 char  Grade;
	 Scanner in = new Scanner(System.in); 

Student(int Serial_No,String First_Name,float cgpa ,char  Grade) 
{
	this.Serial_No = Serial_No;
	this.First_Name = First_Name;
	this.cgpa = cgpa;
	this Grade = Grade;
}
void Display(){
	System.out.println("\nSerial_No"+Serial_No"\nFirst_Name -  "+First_Name"\ncgpa "+cgpa+"Grade "+Grade+" ")
}
void Array()
{
	System.out.println("Enter the no. of students");
 int number = in.nextInt();
	Student a[] = new Student a[number];
	for(i=0;i<a.length;i++)
}

}