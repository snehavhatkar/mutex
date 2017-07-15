import java.util.Scanner;
class OddEven
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
				for(int i=0;i<5;i++)
				{
					if(number[i]%2==0)
					{
						System.out.println("number is even");
					}
					else
					{
						System.out.println("number is odd");
					}
				}
		}
}