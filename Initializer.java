class Initializer 
{
	//static int a = 25;

	static
	{
		System.out.println("Static 1");
		eat();
	}

	public static void eat(){
		System.out.println("Eat lunch");
	}

	static
	{
		System.out.println("Static 2");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		eat();
		System.out.println("Main End");
	}
}
