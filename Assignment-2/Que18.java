//18.	Program to check whether number is prime or not.
import java.util.Scanner;
class Que18{
	public static void main(String abc[])
	{
		int num ,i,c=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter num to check prime or not");
	  num=sc.nextInt();
	  for(i=2;i<num;i++)
	  {
		  if(num % i == 0)
		  {
			  c++;
		  }
	  }
	  if(c == 0)
	  {
		System.out.println(num + " is prime num ");  
	  }
	  else{
		  System.out.println(num + " is not  prime num ");  
	  }
	  
}
}