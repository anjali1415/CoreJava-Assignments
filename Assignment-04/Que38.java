/* 38.	Create a class Employee with three data members (empNo, salary and totalSalary) and 
following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and 
calls Employee method to display no. of employees and total of their salaries.*/
import java.util.Scanner;
class Employee{
	private static int empNo=0;
	private double salary;
	private static  double totalSalary=0;
	Employee(double salary1)
	{
		empNo++;
		salary=salary1;
		totalSalary=totalSalary+salary;
		
	}
	void show()
	{
		System.out.println("Total emp are = " + empNo +"  " + totalSalary);
		
	}
}

class EmpDemo{
	static public void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of emp");
		int count=sc.nextInt();
		Employee arr[]=new Employee[count];
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println("Enter sal");
		  double saln=sc.nextDouble();
		  Employee e=new Employee(saln);
		  arr[i]=e;
		  if(count-1 ==arr.length){
		  e.show();// show everytime after creating object
		  }
		}
	
	/*for(Employee a:arr)
		a.show();
	}*/
	arr[count-1].show();
}
}


