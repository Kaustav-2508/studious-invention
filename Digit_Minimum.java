import java.util.Scanner;
class Digit_Minimum
{
	public static void main( String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num=sc.nextDouble();
		double n=2;
		double mid=num/2;
		double rev=0;
		double rem=0;
		double min=9;
		while(num>0)
		{
			rev=num%10;
			rem=num/10;
			if(rev<min)
			{
				min=rev;
			}
			num=num/10;
		}
		Boolean isprime = true;
		for(n=2;n<=mid;n++)
		{
			if(min%n==0)
			{
				isprime=false;
			}
		}
		if(isprime == true)
		{
			System.out.println("The minimum prime digit is : "+min);
		}
		else
		{
			System.out.println("There is no prime digit in the number ");
		}
		sc.close();
	}
}
			
		