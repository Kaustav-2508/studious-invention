import java.util.Scanner;
class Elec_Units
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the no of electrical units consumed : ");
		int units=sc.nextInt();
		double nba=0.0;
		if(units <= 100)
		{
			nba = units*2.5;
		}
		else if(units<=250)
		{
			nba = 100*2.5 + (units-100)*3.5;
		}
		else if(units<=440)
		{
			nba = 100*2.5 + 150*3.5 + (units-250)*4.75;
		}
		else if(units<= 650)
		{
			nba = 100*2.5 + 150*3.5 + 190*4.75 + (units - 440)*5.75;
		}
		else
		{
			nba = 100*2.5 + 150*3.5 + 190*4.75 + 210*5.75 + (units-650)*8.25;
		}
		nba = nba + (3/100)*nba;
		System.out.print("\n The net bill amount is : " + nba);
		sc.close();
	}
} 