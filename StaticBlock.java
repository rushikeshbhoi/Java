class StaticBlock 
{
	static
	{
		System.out.println("SI-1");
	}

	public static void walk(){
		System.out.println("Walking");
	}
	
	static
	{
		System.out.println("SI-2");
		walk();
	}

	public static void eat(){
		System.out.println("eating");
	}

	static 
	{
		System.out.println("SI-3");
	}

	
}
