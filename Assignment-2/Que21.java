//21.	Program to show sum and average of 10 element array. Accept array elements from user. 
import java.util.Scanner;
class Que21{
	
	public static void main(String abc[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter ele in array");
		for(int i=0;i<10;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum is= " +sum);
		int avg=sum/10;
		System.out.println("avg is= " +avg);
	}
}
	