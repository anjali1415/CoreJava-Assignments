//22.Sort a ten element array in descending order.
//import java.util.Scanner;
class Que22{
	
	public static void main(String abc[])
	{
	   int arr[]=new int[]{2,5,4,3,7,8,9,10,1,6};
	   int temp;
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr.length-1;j++)
		   {
			   if(arr[j] < arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }				   
		   }
		   
	   }
	   for(int a:arr)
	   {
		   System.out.println(a);
	   }
	}
	
}