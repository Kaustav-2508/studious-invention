import java.util.Scanner;
import java.lang.Math.*;
class Armstrong_String
{
	public static void main( String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		String str= Integer.toString(num);
		int length=str.length();
		double sum=0;
		for(char ch:str.toCharArray())
		{
			int digit = ch-'0';
			sum=sum+Math.pow(digit,length);
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