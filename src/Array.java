import java.util.Scanner;
class 1
		Array
{
	public static void main(String args[])
		{
				int number[]=new int[5];
				Scanner scanner=new Scanner(System.in);
				System.out.println("enter no=");
				for(int i=0;i<5;i++)
					{
						number[i]=scanner.nextInt();
					}
				for(int i=0;i<5;i++)
				{
					System.out.println("Number:"+number[i]);
				}
		}
}