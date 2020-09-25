/*34.Create a class Circle that has two data members, one to store the radius and another
 to store area and three methods first init() method to input radius from user, second 
 calculateArea() method to calculate area of circle and third display() method to display
 values of radius and area. Create class CircleDemo ( main class) 
that creates the Circle object and calls init(), calculateArea() and display() methods*/
import java.util.Scanner;
class Circle{
	private double radius;
	private double area;
	void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		radius=sc.nextDouble();
	}
	void calculateArea()
	{
	   this.area=3.14*radius*radius;	
	}
	void Display()
	{
	    System.out.println("radius = " + radius + "\t " + "area= " +area );	
	}
		
	
}

class CircleDemo{
	
	public static void main(String argc[])
	{
		Circle c=new Circle();
		c.init();
		c.calculateArea();
		c.Display();
	}
	
	
	
}