class NonStaticBlock
{
	{
		System.out.println("NS-1");
	}

	public static void walk(){
		System.out.println("Walking");
	}

	static{
		NonStaticBlock n = new NonStaticBlock();
		System.out.println("SI-2");
	}

	{
		System.out.println("NSI-2");
		eat();
	}

	static{
		System.out.println("SI-3");
	}

	public void eat(){
		walk();
		System.out.println("Walking");
	}
}
