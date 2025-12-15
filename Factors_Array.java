import java.util.Scanner;
class Factors_Array
{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num=6;
		int counter = 0;
		int factor[] = new int[4];
		for(int i=1;i<=6;i++)
		{
			if(6%i==0)
			{
				factor[counter]=i;
				counter++;
			}
		}
		for(int j=0; j<counter;j++)
		{
			System.out.println(factor[j]+",");

		}
		sc.close();
	}
}