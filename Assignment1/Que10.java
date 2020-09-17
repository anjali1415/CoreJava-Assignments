//10.	Write a program to convert temperature from Fahrenheit to Celsius. 
//Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
import java.util.Scanner;
class Que10{
     
    public static void main(String abc[])
    {
		float c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr temperature in fahrenheit");
		float f=sc.nextFloat();
		c=5 * ((f-32)/9);
		System.out.println(c);
	}
}