package assi8;
//56.	Write a program to convert very first character of every word in uppercase in a String.
public class Que56 {

	public static void main(String[] args) {
		String an="anjali bad";
		String ar[]=an.split(" ");
		String res="";
		for(int i=0;i<ar.length;i++) {
			String first=ar[i].substring(0,1);
			String rest=ar[i].substring(1);
			res=res+first.toUpperCase()+rest.toLowerCase();
			
			
		}
     System.out.println(res);
	}

}
