import java.util.Scanner;
class Array_Add
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int A[] = new int[15];
		int B[] = new int[15];
		int sum=0;
		for(int i=0; i<15; i++)
		{
			System.out.println("Enter a number : ");
			A[i]=sc.nextInt();
		}
		for(int j=0;j<15;j++)
		{
			sum = A[j]+5;
			B[j]=sum;
			System.out.print(B[j]+",");
		}
		sc.close();
	}
}
			