/*45.	Create a class Student with two members : rollno and percentage. Create default and
 parameterized constructors. Create method show() to display information. Create another class 
 CollegeStudent inherits Student class. Add a new member semester to it. Create default and 
 parameterized constructors. Also override show() method that calls super class show() method and
 displays semester. Create another class SchoolStudent inherits Student class. Add a new member 
 className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also 
 override show() method that calls super class show() method and displays className. Create a 
 class( say Demo) with main method that carries out the operation of the project : -- has array 
 to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two 
 CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all 
 records from the array -- search record on the basic of rollno and check given rollno is of 
 SchoolStudent or of CollegeStudent. --count how many students are */
 
 class Student{
	 private int rollno;
	 private double percentage;
	 Student()
	 {
		
	 }
	 Student()
	 {
		 
		 
	 }
	 void show()
	 {
		 
	 }
}
 class CollegeStudent extends Student{
	 private int semester;
	 CollegeStudent()
	 {
	 }
	 CollegeStudent()
	 {
	 }
	 void show()
	 {
		 super.show();
		 System.out.println("Semester: " + semester);
	 }
	 
 }
 class SchoolStudent extends Student{
	private int className;
      SchoolStudent(){
		  
	  }		  
      SchoolStudent(){
		  
	  }
	  void show()
	  {
		  super.show();
		  System.out.println("className: " +className);
	  }
 }
 class Demo1{
	 System.out.println(String args[])
	 {
		 CollegeStudent c1=new CollegeStudent();
		 CollegeStudent c2=new CollegeStudent();
		 SchoolStudent s1=new SchoolStudent();
		 SchoolStudent s2=new SchoolStudent();
		 SchoolStudent s3=new SchoolStudent();
		 Student arr[]={c1,c2,s1,s2,s3};
		 for(Student s:arr)
			 s.show();
	 }
 }
 
 
 
 
 class( say Demo) with main method that carries out the operation of the project : -- has array 
 to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two 
 CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all 
 records from the array -- search record on the basic of rollno and check given rollno is of 
 SchoolStudent or of CollegeStudent. --count how many students are */