import java.util.Scanner;
class Array
{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num[] ={3,7,8,5};
		num[2]=15;
		//System.out.println(num[1]+" , "+num[3]);
		for(int i=0;i<=3;i++)
		{
			//System.out.print(num[i]+",");
		}
		int num1[] = new int[];
		System.out.println("Enter four numbers : ");
		num1[0]=sc.nextInt();
		num1[1]=sc.nextInt();
		num1[2]=sc.nextInt();
		num1[3]=sc.nextInt();
		int a=num1[0]+num1[2];
		System.out.println(a);
		for(int j=0;j<=2;j++)
		{
			System.out.print(num1[j]+",");
		}
		System.out.print(num1[3]);
		sc.close();
	}
} 