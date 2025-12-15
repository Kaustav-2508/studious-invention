import java.util.Scanner;
class Amount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total purchase amount : ");
		double TA = sc.nextDouble();
		double d;
		double NB;
		if(TA <=2000)
		{
			d=0;
			NB = TA-(d/100)*TA;
		}
		else if(TA<=5000)
		{
			d=5;
			NB = TA-(d/100)*TA;
		}
		else if(TA<=15000)
		{
			d=8;
			NB = TA-(d/100)*TA;
		}
		else if(TA<=30000)
		{
			d=10;
			NB = TA-(d/100)*TA;
		}
		else
		{
			d=15;
			NB = TA-(d/100)*TA;
		}
		System.out.println("The Net Bill Amount is : " + NB);
		sc.close();
	}
}