class NonStaticVariable 
{
	int a;
	static int b;
	public static void main(String[] args) 
	{
		NonStaticVariable n = new NonStaticVariable();
		System.out.println(n.a);		
		System.out.println(n.b);

	}
}
