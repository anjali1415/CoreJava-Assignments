//30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user and 
//then calculate the sum of the elements present in the diagonal.
import java.util.Scanner;
class Diagonal{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		//Take user ip
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter ele:");
				arr[i][j]=sc.nextInt();
			}
		}
	// show	
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
			System.out.print(a+ " ");
			}
			System.out.println(" ");
	}
	// sum
	int sum=0;
	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==i)
				{
					sum=sum+arr[i][j];
				}
			}
		}
	System.out.println(sum);
	
}
}