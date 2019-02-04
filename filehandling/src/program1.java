import java.io.*;
import java.util.*;

class program1{
	public static void main(String[] args) {
		
		File f = null;
		Student s1; 
    try
    {
    	System.out.print("\nEnter the Student details ");
       s1 = new Student(Serial_No,First_Name, cgpa ,  Grade);
    	f = new File("C:\\java_programs\\filehandling\\files\\file1.txt") 
    	FileWriter fout = new FileWriter(f);
    	BufferedWriter bout= new BufferedWriter(fout);
    	Scanner sc = new Scanner(System.in);
    	
    }
     catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }


