import java.util.Scanner;
import java.lang.Math.*;
class Discount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the price of the article : ");
		double MP=sc.nextDouble();
		double perc_d1 = 30.0;
		double perc_d2 = 20.0;
		double perc_d3 = 10.0;
		double D1=0.0,D2=0.0,D3=0.0;
		D1=MP*(perc_d1/100.0);
		D2=MP*(perc_d2/100.0);
		MP=MP-D2;
		D3=MP*(perc_d3/100.0);
		D3=D3+D2;
		System.out.print("\n The total discount offered by the first shopkeeper is : "+D1);
		System.out.print("\n The total discount offered by the second shopkeeper is : "+D3);
		sc.close();
	}
}

		