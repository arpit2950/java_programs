import java.util.*;

public class array1 {
	public static void main(String args[]){
		int num[] = new int[10];
		int rowcounter;
		int searchElement;
		boolean flag;
	Scanner in = new Scanner(System.in);
		//input from user
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			System.out.print("Enter the element[" +(rowcounter+1) +"] : ");
			num[rowcounter] =in.nextInt();
			System.out.println();
		}
	
		System.out.println("Enter the element to be searched : ") ;
		searchElement = in.nextInt();
		//print the array
		System.out.println("Elements in the array are : ");
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			System.out.println(num[rowcounter]);
		}
	//search for the element
		flag = false;
		for(rowcounter=0;rowcounter<num.length;rowcounter++){
			if(num[rowcounter] == searchElement){
				flag = true;
				break;
			}

		}

if(flag)//this means If(flag == true)  . {If(!flag)=(flag==false)}
{
	System.out.println("Elements found at location : " + (rowcounter+1));
	}
	else{
		System.out.println("-1");
	}
}


}