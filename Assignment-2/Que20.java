// 20.	Print all prime numbers between two given numbers. [ break continue ]
import java.util.Scanner;
class Que20{
	public static void main(String abc[])
	{
		int i,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int first=sc.nextInt();
		System.out.println("Enter last num");
		int last=sc.nextInt();
		outer:
		for(i=first;i<=last;i++)
		{
			if(i == 1 || i == 2)
				continue;
			c=1;
			
			for(j=2;j<=i/2;j++)
			{
				if(i % j == 0)
				{
					c=0;
					break;
				}
				
			}
           			
	   
	   if(c == 0)
		{
			System.out.println( i + " is prime num");
		}
		
		}
		
	}
}