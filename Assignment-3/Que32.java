//32.Modify the above program (no. 30)
// to count the no of Student objects created. [ In this program static variable is required ]

/*Create a class Student with 2 data members rno and name. Create one method setData()
 that takes roll number and student name as parameter and stores them in data members rno and
 name. Create one more method showData() to print the data member values. Create another class
 ( main class) StudentDemo that creates Student class object and calls setData()
 and showData() methods.*/
 
 class Student{
	 private int rno;// instance var
	 private String name;// instance + ref var + primitive var 
	  static int count;
	 Student()
	 {
		 count++;
	 }
	 
	 void setData(int roll,String nm)
	 {
		 rno=roll;
		 name=nm;
	 }
	 void showData()
	 {
		 System.out.println("Roll no. is " +rno);
		 System.out.println("name is: " +name);
	 }
	 
	 
 }
 
// main method
	class Que32{
		public static void main(String ab[])
		{
			Student s1=new Student();
			s1.setData(1,"Anjali badgujar");
			s1.showData();
			Student s2=new Student();
			Student s3=new Student();
			System.out.println(Student.count);
		}
	}
	 
	 
	 