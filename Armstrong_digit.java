import java.util.Scanner;
import java.lang.Math.*;
class Armstrong_digit
{
	public static void main( String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		double sum=0;
		String str=Integer.toString(num);
		for(int i=num;i>0;i=i/10)
		{
			int digit = i%10;
			sum=sum+Math.pow(digit,str.length());
		}
		if(sum==num)
		{
			System.out.println(num + " is an Armstrong Number ");
		}
		else
		{
			System.out.println(num + " is not an Armstrong Number");
		}
		sc.close();
	}
}
		