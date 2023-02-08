import java.util.Scanner;

class InputScanner 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two positive integer");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The sum of "+a+ " and "+b+" is "+c);
	}
}
