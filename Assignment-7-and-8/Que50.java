package assi8;
import java.util.*;
/*50.	Explain the importance of toString() and equals() method of the Object class and override 
 * them on class Employee(empId,name,salary).  a. Create class for main method(say XYZ),and accept
 *  five employees information and store in an array. Also ensure if entered empId already exist or
 *   not (use equals method).  b. Display all employee info using toString method.
 */
class Employee{
	private int empId;
	private String empName;
	private double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  empId + " " + empName + " "+ salary ;
	}
	@Override
	public boolean equals(Object sup)
	{
		if(sup == null)
			return false;
		if(sup instanceof Employee)
		{
			Employee e=(Employee)sup;
			return empId== e.empId;
		}
		return false;
	}
	
	
}
public class Que50 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
			//1
			System.out.println("Enter empId");
			int eid1=sc.nextInt();
			System.out.println("Enter Emp name:");
			String name1=sc.next();
			System.out.println("Enter Emp salary:");
			Double sal1=sc.nextDouble();
			Employee e1=new Employee(eid1,name1,sal1);
			
			//2
			System.out.println("Enter empId");
			int eid2=sc.nextInt();
			System.out.println("Enter Emp name:");
			String name2=sc.next();
			System.out.println("Enter Emp salary:");
			Double sal2=sc.nextDouble();
			Employee e2=new Employee(eid2,name2,sal2);
	       
			System.out.println(e1.equals(e2));
		    //3
			System.out.println("Enter empId");
			int eid3=sc.nextInt();
			System.out.println("Enter Emp name:");
			String name3=sc.next();
			System.out.println("Enter Emp salary:");
			Double sal3=sc.nextDouble();
			Employee e3=new Employee(eid3,name3,sal3);
	       
			System.out.println(e2.equals(e3));
			 System.out.println(e1.equals(e3));
			//4
              //print1
			System.out.println(e1);
		     System.out.println(e2);
		     System.out.println(e3);
		
		sc.close();	
	}

}
