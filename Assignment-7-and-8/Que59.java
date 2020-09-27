package assi8;
/*59.	Create a class Voter(voterId, name, age) with parameterized constructor.  The parameterized
 *  constructor should throw a checked exception if age is less than 18. The message of exception 
 *  is “invalid age for voter ”
 */
class Voter{
	private int voterId;
	private String name;
	private int age;
	public Voter(int voterId, String name, int age) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		try {
		    if(age < 18)
		    {
			  
		     }
	}catch(NumberFormatException e)
		{
		
		}
	
}
}
public class Que59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	}

}

