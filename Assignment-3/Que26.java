//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
import java.util.Scanner;
class A{
   
   public static void main(String argc[])
   {
	   int a[]={1,2,3,4};
	   int b[]={5,6,7,8};
	   int c[]={9,10,11,12};
	   int d[]={13,14,15,16};
	   int e[]={17};
	   
		int size=5,sum=0;
		int arr[][]=new int[size][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum=arr[i][j]+sum;
			}
			
		}
		System.out.println(sum);
		
   }
}