import java.util.Scanner;
class Factorial
{
	public static void main( String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num=sc.nextDouble();
		double fact=1;
		for(double i=1;i<=num;i=i+1)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of "+num+" is "+fact);
		sc.close();
	}
}