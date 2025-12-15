class Fibonacci_50
{
	public static void main( String[]args)
	{
		double a,b,c;
		int count=0;
		a=0;
		b=1;
		c=0;	
		while(count<51)
		{
			c=a+b;
			System.out.print(c +",");
			count=count+1;
			a=b;
			b=c;
		}
	}
}