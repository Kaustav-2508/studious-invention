import java.util.Scanner;
import java.lang.Math.*;
//import prime.*;
class Factors
{
	String str;
	public String allFactors(int num)
	{
		str = "";
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				str = str + Integer.toString(i) + ",";
		}
		return str;
	}

	public String evenFactors(int num)
	{
		str = "";
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
					str = str + Integer.toString(i) + ",";
			}
		}
		return str;
	}
	public String oddFactors(int num)
	{
		str = "";
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i%2!=0)
					str = str + Integer.toString(i) + ",";
			}
		}
		return str;
	}
	public String chkprime(int num)
	{
		str="";
		prime p = new prime();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(p.isprime(i)==true)
					str = str + Integer.toString(i) + ",";
			}
		}
		return str;
	}

	public static void main( String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x =sc.nextInt();
		Factors f = new Factors();
		System.out.println("The List of ALL factors of " + x + " is "+f.allFactors(x));
		System.out.println("The List of EVEN factors of " + x + " is "+f.evenFactors(x));
		System.out.println("The List of ODD factors of " + x + " is "+f.oddFactors(x));
		System.out.println("The List of PRIME factors of " + x + " is "+f.chkprime(x));

	}			


}
			
			
						
			