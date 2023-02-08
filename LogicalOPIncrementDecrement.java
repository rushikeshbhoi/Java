class LogicalOPIncrementDecrement 
{
	public static void main(String args[]){
		int a = 4;
		int b = 7;
		int c = 19;
		int d = 13;
		boolean e = (--c >= b++) || (d++ < --a);
		//            18     7        13    4        
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);  // The value of b is 8 because it post incremented and assign to b variable
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		System.out.println("e = "+ e);
		
		int z = 9;
		int x = z++; 
		System.out.println("x " + x); // It will print 9 because it just a single statement
		
		int u = 5;
		int i = ++u;
		System.out.println("i " +i);
	}
}