//16.	Write a program to print table of any entered number using loop.
import java.util.Scanner;
class Que16{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to get Table");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int ans=i*num;
			System.out.println(ans);
		}			
	}
}