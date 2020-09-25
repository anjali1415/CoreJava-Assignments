/* 47.	Create a program to demonstrate constructor chaining.*/
class A{
	A()
	{
		this(1);
		System.out.println("In A");
	}
	A(int a)
	{
		System.out.println("In A perameterised "+ a);
	}
}
class B extends A{
	B()
	{
		this(6);
		System.out.println("In B");
	}
	B(int c){
		//super(5);
		System.out.println("In B para " + c);
	}
}
class DemoChin{
	public static void main(String args[])
	{
		B b1=new B();
	}
	
}