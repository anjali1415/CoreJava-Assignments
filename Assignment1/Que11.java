//11.Write a program to swap two numbers without using third variable.
import java.util.Scanner;
class Que11{
     
    public static void main(String abc[])
    {
		int num1=20;
		int num2=30;
		System.out.println("Before swapping " + num1 +" " +num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping " +num1 +" " +num2);
	}
}