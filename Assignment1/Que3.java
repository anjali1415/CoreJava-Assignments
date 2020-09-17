class Que3{

    public static void main(String abc[])
    {
		  int x=2;
		  int y;
		  //A
		  y = x*x + 3*x - 7 ;
		  System.out.println(y);
		  //B
		  y = x++ + ++x;
		  System.out.println(y);
		  System.out.println(x);
		  //c
		  int z;
		  z = x++ - --y - --x  +  x++ ;
		  System.out.println(y);
		  System.out.println(x);
		  System.out.println(z);
		  //d
		  boolean c;
		  boolean a=true;
		  boolean b=false;
		  c= a && b || !( a || b );
           System.out.println(c);
	}
	
}