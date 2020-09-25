/* 35.	Create a class MathOperation that has four static methods. add() method that
 takes two integer numbers as parameter and returns the sum of the numbers. subtract()
 method that takes two integer numbers as parameter and returns the difference of the numbers.
 multiply() method that takes two integer numbers as parameter and returns the product. power()
 method that
 takes two integer numbers as parameter and returns the power of first number to second number.*/
 

class MathOperation{
	
	
	static int add(int n1,int n2)
	{
		return n1+n2;
	}
	static int substract(int n1,int n2)
	{
		return n1-n2;
	}
	static int multiply(int n1,int n2)
	{
		return n1*n2;
	}
	static int power(int n1,int n2)
	{
		int ans=(int)(Math.pow(n1,n2));
		return ans;
	}
	
}

class demo{
	
	public static void main(String argc[])
	{ 
	    //MathOperation op=new MathOperation();
		System.out.println(MathOperation.add(5,6));
		System.out.println(MathOperation.substract(4,2));
		System.out.println(MathOperation.multiply(2,8));
		System.out.println(MathOperation.power(2,3));
		
		
	}
}