//14.	Program to check that entered year is a leap year or not.

import java.util.Scanner;
class Que14{
     
    public static void main(String abc[])
    {
	   Scanner refvar=new Scanner(System.in);
	    System.out.println("Enter year");
	   int yr=refvar.nextInt();
	   if((yr % 4) == 0 && ((yr % 100 != 0) || (yr % 400 == 0 )))
	   {
		   System.out.println("Leap year");
	   }
	   else
	   {
		   System.out.println(" not Leap year");
	}
}
}

