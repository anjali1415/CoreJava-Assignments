//15.	Accept person’s gender (character m for male and f for female), age (integer), 
//as input and then check whether person is eligible for marriage or not.
import java.util.Scanner;
class Que15{
     
    public static void main(String abc[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender male as m and female as f");
		String gen1=sc.next();
		System.out.println("Enter the gender male as m and female as f");
		String gen2=sc.next();
		System.out.println("Enter the gender age");
		int age=sc.nextInt();
		if ( (gen1 != gen2)  && age > 18)
		{
			System.out.println("Person is eligible for marraige");
		}
		else 
		{
			System.out.println("Not eligible");
		}
		
	}
}