//17.	Write a program to reverse a given number.
import java.util.Scanner;
class Que17{
	public static void main(String abc[])
	{
		int rem,ans=0;
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		while (num > 0)
		{
			rem= num % 10;
			ans=(ans * 10) + rem;
			num=num / 10;
		}
		System.out.println(ans);
			
	}
}
	