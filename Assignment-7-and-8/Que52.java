package assi8;
import java.util.Scanner;
//52.	Input name of a person and count how many vowels it contains.  Use String class functions. 
public class Que52 {
      static int count;
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter string");
		String name=sca.nextLine();
		for(int i=0;i<name.length();i++)
		{
		if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'O' || name.charAt(i) == 'I' || name.charAt(i) == 'U' ||
			name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'i' || name.charAt(i) == 'u')
		{
			count++;
		}
		
		}
		System.out.println(count);
		sca.close();

	}

}
