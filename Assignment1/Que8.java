//08.	Write a program to find the simple interest. Take the principle amount, 
//rate of interest and time from user using Scanner class.
import java.util.Scanner;
class Que8{
     
    public static void main(String abc[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double p=sc.nextDouble();
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
		double ans= (p*t*r)/100;
		System.out.println("SI= " +ans);
	}
}