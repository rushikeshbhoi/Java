class MethodOverloadingDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		MethodOverloading.add(3,5,3);
		MethodOverloading.add(3,5);
		MethodOverloading.add(3,5.23);
		MethodOverloading.add(3.23,7.45);
	//	MethodOverloading.add(3.23,5.23);

		System.out.println("Main Ended");

	}
}
