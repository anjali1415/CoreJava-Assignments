package assi8;
/*58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position 
 * from user and print day name. Handle array index out of bound exception and give proper message
 *  if user enter day index outside range (0-6). 
 */
import java.util.Scanner;

public class Que58 {

	public static void main(String[] args) {
		String arr[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Firday","Saturday"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day you want:");
		int pos=0;
		try {
			 pos=sc.nextInt();
			System.out.println(arr[pos]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("sorry enter day "+pos+ " is not valid ");
		}
       sc.close();
	}

}
