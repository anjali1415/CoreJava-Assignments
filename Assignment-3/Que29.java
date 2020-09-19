//29.Write a program to print the total number of one-D arrays in a two-D array and 
//the number of elements in every one-D array present in the two-D arrays.
import java.util.Scanner;
class Arr{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[][]=new int[size][];
		
		System.out.println("total number of one-D arrays in a two-D array are " + size);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter columns for " +i + "th row " );
			int col=sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter ele");
				arr[i][j]=sc.nextInt();
				
			}
			System.out.println("number of ele present at " + i + "th row are " +col);
		}
}
}