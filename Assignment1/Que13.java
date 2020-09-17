//13.	Program to find greatest in 3 numbers. 
//[ once using if else statement and then using ternary operator ( logical operator) ]  
import java.util.Scanner;
class Que13{
	
    //By else if statement 
    /*public static void main(String abc[])
    {
	    Scanner obj=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=obj.nextInt();
		System.out.println("Enter num2");
		int num2=obj.nextInt();
		System.out.println("Enter num3");
		int num3=obj.nextInt();
		if(num1 > num2 && num1 > num3 )
		{
			System.out.println(num1 + " is graetest of all");
		}
		else if (num2 >num3 && num2 > num1)
		{
		   System.out.println(num2 + " is graetest of all");	
		}
		else
		{
			System.out.println(num3 + " is graetest of all");
		}
		*/
		
		public static void main(String abc[])
       {
	    Scanner obj=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=obj.nextInt();
		System.out.println("Enter num2");
		int num2=obj.nextInt();
		System.out.println("Enter num3");
		int num3=obj.nextInt();
		int ans=(num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		{
			System.out.println(ans + " is graetest of all");
		}
	  }
}