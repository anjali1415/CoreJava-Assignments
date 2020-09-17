/*12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
 then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal
 to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary 
 is input by the user write a program to find his gross salary. 
[ formula : GS= Basic + DA + HRA ]*/

import java.util.Scanner;
class Que12{
     
    public static void main(String abc[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		float bsal=sc.nextFloat();
		if(bsal < 10000)
		{
			float HRA=(bsal*10) /100 ;
			float DA=(bsal*90)/100;
		    float GS=bsal+DA+HRA;
			System.out.println("Gross sal for bsal " +bsal + " is " +GS );
		}
		else if(bsal >= 10000)
		{
		    float HRA=2000;
			float DA=(bsal * 90)/100;
		    float GS=bsal+DA+HRA;
			System.out.println("Gross sal for bsal " +bsal + " is " +GS );
		}
		else{
			
			System.out.println("Invalid sal" );
	}
}
}