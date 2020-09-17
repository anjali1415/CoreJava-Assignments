//07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
 //Take the obtained marks from user using Scanner class. 
//Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
import java.util.Scanner;
class Que7{
     
    public static void main(String abc[])
    {
	    double n=500.0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter sub1 marks");
	  double sub1=sc.nextDouble();
	  System.out.println("Enter sub2 marks");
	  double sub2=sc.nextDouble();
	  System.out.println("Enter sub2 marks");
	  double sub3=sc.nextDouble();
	  System.out.println("Enter sub4 marks");
	  double sub4=sc.nextDouble();
	  System.out.println("Enter sub5 marks");
	  double sub5=sc.nextDouble();
	    double ans=(sub1+sub2+sub3+sub4+sub5)/n;
		double ans1=ans*100;
		System.out.println("Percentage marks= " +ans1+ "%");
	 
	  
	}
}