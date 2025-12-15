import java.util.Scanner;
class Amount_exam
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the price of the digital camera : ");
		double P=sc.nextDouble();
		final double d=10.0;
		final double gst=6.0;
		double P1=0.0,P2=0.0;
		P1=P-(P*d/100.0);
		P2=P1*(1+gst/100.0);
		System.out.print("\n The final amount to be paid is : "+P2);
		sc.close();
	}
}