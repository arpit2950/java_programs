package com.ncu.assignment;
public class Project{
String name;
String startDate;
String endDate;
String  role;

String responsibilities[];

public Project()
{
	name = "";
	startDate = "";
	endDate = "";
     role = "";
	
	
		responsibilities = null;
	
}

public Project(String name ,String startDate ,String endDate ,String  role,String responsibilities[])

{
	this.name = name ;
	this.startDate = startDate;
	this.endDate = endDate;
this.role = role;
 this.responsibilities = responsibilities;

}
public void DisplayProject(){
		System.out.println("Project name :"+name);
		System.out.println("startDate :"+startDate);
		System.out.println("endDate :"+endDate);
		System.out.println("role "+role);
		for(int i=0 ;i<responsibilities.length;i++)
{
		System.out.println("responsibilities "+responsibilities[i]);
}
	}
}