/* 44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for
 accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance.
 Override input() method in this class that calls super class inut() method and accepts 
 basicSalary and allowance as input. Salary should not be accepted as input but should be 
 calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour.
 Override input() method in this class that calls super class inut() method and accepts 
 workingHours and ratePerHour as input. Salary should not be accepted as input but should be
 calculated using formula ( workingHour * ratePerHour )*/
import java.util.Scanner;
 class Faculty{
	 
	 private int facultyId;
	 protected double salary;
	 void input()
	 {   
	      Scanner sc=new Scanner(System.in);
		 System.out.println("Enter facultyId");
		  this.facultyId=sc.nextInt(); 
        
	 }
	 void printSalary()
	 {
		System.out.println("salary is "+salary+ " facultyId = "+facultyId); 
	 }
 }
 class FullTimeFaculty extends Faculty{
	 private double basicSalary;
	 private double allowance;
	 void input()
	 {
		 super.input();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter basicSalary");
		  this.basicSalary=sc.nextDouble(); 
		  System.out.println("Enter allowance");
		  this.allowance=sc.nextDouble(); 
		  
	 }
     void calculatedSalary(){
        salary = basicSalary+allowance;
     }	 
 }
 class PartTimeFaculty extends Faculty{
	 
	 private double workingHour;
	 private double ratePerHour;
	 void input()
	 {
		 
		super.input();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter workingHour");
		  this.workingHour=sc.nextDouble(); 
		 System.out.println("Enter ratePerHour");
		  this.ratePerHour=sc.nextDouble(); 
		//this.salary=workingHour+ratePerHour;
	
		
	 }
	 void calculatedSalary(){
        salary = workingHour * ratePerHour;
    }
	 
 }
class Main{
	public static void main(String args[])
	{
		PartTimeFaculty p=new PartTimeFaculty();
		p.input();
		p.calculatedSalary();
		p.printSalary();
		FullTimeFaculty f=new FullTimeFaculty();
		f.input();
		f.calculatedSalary();
		f.printSalary();
		
		
		
	}
}