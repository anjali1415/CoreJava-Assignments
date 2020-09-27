package assi8;
import  java.util.Scanner;
//55.	Write a program to count no of words in the String.
public class Que55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String str=sc.nextLine();
		int count=0;
		
		String a=str;
		/* int s=a.length();
		System.out.println(s);*/
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) != ' ')
				{
			      count++;
				}
		}
		System.out.println(count);
		sc.close();
	}
 
}
