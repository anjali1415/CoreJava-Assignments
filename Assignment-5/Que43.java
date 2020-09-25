/*43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create 
default constructor that initializes instance variables with some values and a parameterized 
constructor that takes values for all instance variables and stores them in instance variables.
 Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and 
a new instance variable room2Area. Then create default constructor to initialize all 4 instance 
variables and a parameterized constructor to take the values for initialization of all instance
 variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print 
information using show method. Also print total amount of all flats. 
*/
class OneBHK{
	private int roomArea;
	private int hallArea;
	private int price;
	private int total;
	OneBHK()
	{
		
		roomArea=0;
		hallArea=0;
		price=0;
		System.out.println("in cobsre");
		
	}
	OneBHK(int roomArea,int hallArea,int price){
		this();
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
		this.total=this.total+price;
	}
	void show()
	{
		System.out.print(roomArea + " " + hallArea +" " + price+ " total of all flats " + total);
	} 
	
}
class TwoBHK extends OneBHK{
	private int room2Area;
	TwoBHK(){
		 
		room2Area=0;
		System.out.println("cc");
	}
	TwoBHK(int roomArea,int room2Area,int hallArea,int price){
		 super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show()
	{
		//super.show();
		System.out.println("room2Area "+room2Area);
	}
	
}
class Demo{
	
	public static void main(String args[])
	{
	   OneBHK b1=new TwoBHK(1,2,3,499000);
	  b1.show();
	   TwoBHK b2=new TwoBHK(4,5,6,798890);
	   b2.show();
	   TwoBHK b3=new TwoBHK(3,4,5,600000);
	   b3.show();
	}
	
}