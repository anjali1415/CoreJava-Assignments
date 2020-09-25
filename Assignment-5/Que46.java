//46.	Create a program to demonstrate the use of instanceof operator or secure reference down 
//casting.
class Person{
	private int id;
	private int sal;
	
	void setper(int id,int sal)
	{
		this.id=id;
		this.sal=sal;
	}
	void show()
	{
		System.out.println("in person show");
	}
	
}
class Emp extends Person{
	 void setEmp(int id,int sal)
	{
		//super.show();
		System.out.println("in emp");
	}
	void show()
	{
		System.out.println("in emp show");
	}
	
}
class Demo2{
	public static void main(String ac[])
	{
		
		Person arr[] = {new Emp(),new Person()};
		for(Person a : arr)
		{
		 if(a instanceof Emp){
			
		    Emp e=(Emp) a;
	         e.show();
			 e.setEmp(12,2300);
		}
		else{
			System.out.println("no");
		
		}
	}
}
}