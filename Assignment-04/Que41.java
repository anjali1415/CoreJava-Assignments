/*41.	Write a program to demonstrate this() construct functionality.*/

// this fun demo
import java.util.Scanner;
class ThisFun{
	private int id;
	private String  name;
	private int id1;
	private String  name1;
	private int sal1;
	ThisFun()
	{
		this(100,"anjali");// it should be first fun.
		System.out.println("in non-para constr");
	}
	
	ThisFun(int id,String name)
	{ 
	   //this();//error recursive constr call
	     //Scanner sc=new Scanner(System.in);
		 //System.out.println("Enter id2:");
		 //int id2=sc.nextint();
		this(5, "tushar",4000);
		this.id=id;
		this.name=name;
		System.out.println("in para constr");
	}
	ThisFun(int id1,String name1,int sal1 )
	{
		//this();// error recursive constr call
		this.id1=id1;
		this.name1=name1;
		this.sal1=sal1;
		System.out.println("In three para constr");
		
	}
	void show()
	{
		System.out.println(id +" " + name);
		System.out.println("by " + id1 +" " + name1 + " " + sal1);
	}
	
}


class Thisfundemo{
	
	public static void main(String args[])
	{
		ThisFun f1=new ThisFun();
		  f1.show();
	}
	
	
}