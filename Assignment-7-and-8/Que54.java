package assi8;
//54.	Write a program to reverse the given String.
import java.util.Scanner;
public class Que54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
       StringBuilder s= new StringBuilder(str);
       s=s.reverse();
       System.out.println(s);
       sc.close();
    		   
	}

}
