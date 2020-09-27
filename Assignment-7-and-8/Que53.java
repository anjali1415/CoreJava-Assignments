package assi8;
import java.util.Scanner;
// 53.	Input data exactly in the following format, and print sum of all integer values. “67, 89,
//23, 67, 12, 55, 66”.  
//(Hint use String class split method and Integer class parseInt method) 
public class Que53 {
    
    public static void main(String[] args) {
		
    	Scanner sca=new Scanner(System.in);
    	System.out.println("Enter int num to get sum:");
    	String str=sca.nextLine();
    	String arr[]=str.split(" ");
    	int sum=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		sum=sum+Integer.parseInt(arr[i]);
    	}
    	System.out.println(sum);
    		sca.close();
    	}
	}

