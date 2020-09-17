//09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//Now convert the entered days into complete years, months and days and print them.

import java.util.Scanner;
class Que9{
     
    public static void main(String abc[])
    {
		int y,m,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days");
		int num=sc.nextInt();
		
		int yr;
		int mt;
		int days;
		yr=num/365;
		mt=num/30;
		days=num/1;
		if ( mt >= 12)
		{
			mt=mt - 12*yr;
			if ( days > 365)
			{
				days=days -365*yr;
			}
		}
		System.out.print("Year= " +yr + " months= " +mt+ " days= " +days );
		
	}
}