/*48.	Create an Abstract class Processor with int member variable data  and method showData to
 display data value. Create abstract method process() to define processing of member data. Create
 a class  Factorial using abstract class Processor  to calculate and print factorial of a number
 by overriding the process method. b. Create a class Circle using abstract class Processor to 
 calculate and print area of a circle by overriding the process method.Ask user to enter choice 
 (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve
 this mechanism.*/
 import java.util.Scanner;
abstract class Processor{
	protected int data;
	abstract void process();
	void showData()
	{
		System.out.println("data is " +data);
	}
	
}
 class Factorial extends Processor{
	void process()
	{
		this.data=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to finf fact: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			this.data=this.data*i;
		}
		
	}
}
 class Circle extends Processor{
	 void process()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter radius to find area:");
		 double r=sc.nextInt();
		 this.data=(int)(3.14*r*r);
	 }
 }

class Demo1{
	public static void main(String ab[])
	{
		int choice;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice 1.factorial 2.Area 0.Exit" );
		 choice=sc.nextInt();
		switch(choice)
		{
			case 1:
		           Processor p=new Factorial();
		           p.process();
		           p.showData();
				   break;
			case 2:
		           Processor p1=new Circle();
		           p1.process();
		           p1.showData();
				   break;
			default:
			       System.out.println("Invalid choice: ");
				   
		}
	}while(choice != 0);
  }

}