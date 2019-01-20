import java.util.*;

class Circle{

	private double radius;
	private String color ;
    private final double pi = 3.14;
  Circle(){
  	radius = 1.0;
  	color = "red";
  }
  Circle(double radius ){
   this.radius = radius;
  }
  Circle(double radius , String color){
   this.radius = radius;
   this.color = color ;
  }

  public double getRadius(){
return radius;

  }

 public void setRadius(double radius){
 	this.radius= radius;

 }

 public String getColor(){
return color ;
 }
public void setColor(String color){
this.color = color;
}
public double getArea(){
	return pi*radius*radius;
}
}
class Cylinder extends Circle{
	private double height ;
	Cylinder(){
		super();
		height = 1.0;

	}
Cylinder (double radius){
	super (radius);
	height = 1.0;
}
Cylinder (double radius,double height){
super (radius);
this.height = height;
}

Cylinder(double radius,double height,String color){
	super (radius,color);
	this.height = height;
}
public double getHeight(){
	return height;
}
public void setHeight(){
	this.height=height;
}

public double volume(){
	return super.getArea()*height;

}}
public class program1
{public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	Cylinder c1 = new Cylinder(2,2,"blue");
System.out.println(c1.volume());
System.out.println(c1.getArea());
System.out.println(c1.getColor());
}
}