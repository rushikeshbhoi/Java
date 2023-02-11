class NonStaticBlockDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		NonStaticBlock n = new NonStaticBlock();
		n.eat();
		NonStaticBlock.walk();
		System.out.println("Main End");
	}
}
