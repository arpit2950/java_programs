import java.util.*;
class PointSort{
	static Scanner in = new Scanner(System.in);
static int i ;
static int j;
static Point pArr[] = new Point[5];

static double x;
static double y;
static Point temp = new Point();
	
static void Save(){

	for(i=0;i<pArr.length;i++){
		System.out.println("Enter values for Point 1 : ");
		System.out.println("Enter the values of x : ");
         x = in.nextDouble();
         System.out.println("Enter the values of y : ");
         y = in.nextDouble();
         pArr[i] = new Point(x,y);

	}
}
static void Sort(){
for(i=0 ; i<pArr.length;i++)
{
	for(j=0;j<pArr.length;j++){
		if(pArr[i].getY() > pArr[j].getY()){
			temp = pArr[i];
			pArr[i] = pArr[j];
			pArr[j] = temp;

		}
	}
}
System.out.println("Sorted is : ");
for(i=0;i<pArr.length;i++){
	System.out.println(pArr[i].getX() + " " + pArr[i].getY());
}
}

public static void main(String args[]){

	Save();



Sort();



}
}