 //06.	Write a program that takes radius of a circle as input.
 //Read the entered radius using Scanner class. 
 //Then calculate and print the area and circumference of the circle.


import java.util.Scanner;
class Que6{
     
    public static void main(String abc[])
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter radius of circle");
	  double rad=sc.nextDouble();
	  double area=3.14 * rad *rad;
	  double circum=2 * 3.14* rad;
	  System.out.println("Area is= " +area);
	  System.out.println("circumference is = " +circum);
	}
}