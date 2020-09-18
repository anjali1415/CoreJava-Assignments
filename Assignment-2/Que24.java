//24.	Write a program to search an element in the array.

class Que24{
	
	public static void main(String abc[])
	{
		int arr[]={2,3,4,5,6,9};
		int search=8,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == search)
			{
				System.out.println(search +" Found at " +i+ " index" );
				count ++;
				break;
			}
			
		}
		if(count == 0)
		{
		System.out.println(search + " not Found at any index" );
		}
		
	}
}
