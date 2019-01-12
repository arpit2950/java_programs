import java.util.*;

 class month {
	public static void main(String[]args){
		Scanner a = new Scanner(System.in);
		int x;
char ch;
 		
		do{
			System.out.println("enter the month number");
		 x = a.nextInt();

		switch(x){

			case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
			case 4:
			System.out.println("april");
			break;
			case 5:
			System.out.println("may");
			break;
			case 6:
			System.out.println("June");
			break;
			case 7:
			System.out.println("Jul");
			break;
			case 8:
			System.out.println("Aug");
			break;
			case 9:
			System.out.println("Sept");
			break;
			case 10:
			System.out.println("Oct");
			break;
			case 11:
			System.out.println("Nov");
			break;
			case 12:
			System.out.println("Dec");
			break;
			default :
			System.out.println("error");
			break;
		}
            System.out.println("if you want to quit press q");
					
				
			ch = a.next().charAt(0);	
		} while(ch !='q');

		}




}
	
