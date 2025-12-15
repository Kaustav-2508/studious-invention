import java.util.Scanner;
import java.lang.Math.*;
class Area_Triangle
{
	public static void main( String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the first side of the triangle : ");
		double a=sc.nextInt();
		System.out.println("Enter the length of the second side of the triangle : ");
		double b=sc.nextInt();
		System.out.println("Enter the length of the third side of the triangle : ");
		double c=sc.nextInt();
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is : "+ area);
		sc.close();
	}
} 