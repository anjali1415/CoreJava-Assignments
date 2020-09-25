/*36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate 
multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/

class MathOperation1{
	 int ans=1;
	int multiply(int a,int b)
	{
		return a*b;
	}
	 float multiply(float a,float b,float c)
	{
		return a*b*c;
	}
	int multiply(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			 ans=ans*ar[i];
		}
		return ans;
		
	}
	double multiply(int a,double b)
	{
		return a*b;
	}
	
	public static void main(String argc[])
	{ 
	    //MathOperation op=new MathOperation();
		MathOperation mop=new MathOperation();
		System.out.println(mop.multiply(2,3));
		System.out.println(mop.multiply(2.3f,2.3f,2.3f));
		int arr[]=new int[]{1,2,3,4};
		System.out.println(mop.multiply(arr));
		System.out.println(mop.multiply(4,6.1));
		
		
	}
	
}