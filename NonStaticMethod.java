class NonStaticMethod 
{	
	public void eat()
	{
		System.out.println("eating");
	}
	
	public String walk(){
		return "walking";
	}
	public static void main(String[] args) 
	{
		NonStaticMethod n = new NonStaticMethod();
		n.eat();
		System.out.println(n.walk());
	}
}
