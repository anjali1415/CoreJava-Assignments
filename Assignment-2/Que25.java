//25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

class Que25{
	
	public static void main(String abc[])
	{
		int sum=0,sum1=0;
		int arr[]=new int[]{2,1,4,5,3,7,8,9,};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0 )
			{
				sum=sum + arr[i];
			}
			else
			{
				sum1=sum1+arr[i];
			}
		}
		System.out.println("sum of even num is " +sum);
		System.out.println("sum of odd num is " +sum1);
	}
} 