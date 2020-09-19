//27.Write a program to fine the smallest and greatest number present in the array of integer type.
import java.util.Scanner;
class Ab{
   
   public static void main(String argc[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of array:");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println("Enter ele:");
		   arr[i]=sc.nextInt();
	    }
		   // show ele
		  int temp;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length-1;j++)
			 {
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}					
			 }
		 }
		 System.out.println("Smallest num : " + arr[0]);
		 System.out.println("Greatest num : " + arr[size-1]);
		 
			 
  }
}