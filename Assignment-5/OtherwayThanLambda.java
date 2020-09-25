interface lambda{
   boolean test(int num);
}
class ArrOpe{
	
    static void showArray(int arr1[],lambda ref)
	{
		for(int p : arr1){
			if(ref.test(p))
			{
				System.out.print(" "+p);
			}
			//System.out.print("");
		}
	}
	
	
}
class Demo7{
	public static void main(String abc[])
	{
		static boolean test(int n)
		{
           return n%2;
		}			
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		ArrOpe.showArray(a,Demo7::test);
	}
}