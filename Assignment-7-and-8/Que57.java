package assi8;
//57.	Write a program to reverse every word of the String.
import java.util.Scanner;
public class Que57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		/*for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
		}*/
		//or
		StringBuilder sp=new StringBuilder(s);
		 System.out.println(sp.reverse());
		sc.close();	
	}

}
