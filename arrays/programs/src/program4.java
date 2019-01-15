import java.util.*;
class program4 {
	 static Scanner num = new Scanner(System.in);
	 static int arr[] = new int[5];
	 static  int i ,k,n;
	 static	boolean flag;
		static void getinput(){
System.out.println(i+"Enter number:");
			n = num.nextInt();
		}
		static void checkValidity(){
			while(true)
			{
				if(n>9 && n<101 )
					break;
				System.out.print(" the five Integers should be b/w  10 and 100");
				n = num.nextInt();
			}
		}
		static void duplicate()
		{
			flag = false;
          for(k=i-1;k>=0;k--)
          {
             if(n==arr[k])
             {
                 System.out.println("Duplicate Entry");
                 flag = true ;

             }
         }
		} 
		static void arrayPrinting(){
			System.out.println("===================");
		for( k=0;k<=i;k++){       //Array printing
	        	System.out.print(arr[k]+" ");
		}
		System.out.println("\n===================");
	    }
		}
	public static void main(String[] args){
		
		System.out.println("Enter the five Integers lying between 10 and 100 .no duplicates");
		
		for(i=0;i<5;i++){
			getinput();
			checkValidity();
			duplicate();
             if(flag==true)
             {
             	i=i-1;
             	continue;
             	 }
            

			arr[i] = n;
			arrayPrinting();
		}
	}
