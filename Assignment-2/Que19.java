//19.	Calculate  series : 12+22+32+42+.........+n2
import java.util.Scanner;
import java.lang.Math; 
class Que19{
	public static void main(String abc[])
	{
		int i,ans1=0;
		double ans=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Two num for range to find sum of num in range ");
	 // System.out.println("Enter num1");
	  //int num1=sc.nextInt();
	  System.out.println("Enter num2");
	  int num2=sc.nextInt();
	  for(i=1;i<=num2;i++)
	  {
		ans =ans + Math.pow(i,2); 
	  }
	  ans1=(int)(ans);
	  System.out.println("ans= "+ans1);
	}
}