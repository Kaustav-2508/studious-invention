import java.util.Scanner;
class Characters
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		int x = ch;
		System.out.println("The ASCII value of the character "+ ch + " is "+x);
		sc.close();
	}
}