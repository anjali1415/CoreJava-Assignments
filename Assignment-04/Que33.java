//33.	Write a program to demonstrate functionalities of this keyword in java
import java.util.Scanner;
class Thisdemo{
	private boolean check;
	private double sal;
	Thisdemo(boolean check,double sal)
	{
		if (check == true)
		{
		this.check=check;
		this.sal=sal;
		
		}
		else
			System.out.println("Not employee");
	}
	int show()
	{
		System.out.println(check + "  " + sal);
		return 0;
	}
}

class Que33{
	public static  void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter boolean value:");
		boolean var=sc.nextBoolean();
		System.out.println("Enter salary");
		double sal1=sc.nextDouble();
		Thisdemo d1=new Thisdemo(var,sal1);
		d1.show();
		
	}
	
}
