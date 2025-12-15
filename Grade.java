import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks obtained out of 100 in four subjects : ");
		double S1= sc.nextDouble();
		double S2= sc.nextDouble();
		double S3= sc.nextDouble();
		double S4= sc.nextDouble();
		char ch;
		double avg=(S1+S2+S3+S4)/4.0;
		if(avg>=85)
		{
			ch='A';
		}
		else if(avg< 85 && avg>=70)
		{
			ch='B';
		}
		else if(avg<70 && avg>=50)
		{
			ch='C';
		}
		else if(avg<50 && avg>=40)
		{
			ch='D';
		}
		else
		{
			ch='F';
		}
		System.out.println("The grade obtained is : "+ch);
		sc.close();
	}
}
		
		

		