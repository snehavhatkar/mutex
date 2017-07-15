import java.util.Scanner;
class ScannerDemo
{
	public static void main(String args[])
		{
				Scanner scanner=new Scanner(System.in);
				int no1,no2;
				no1=scanner.nextInt();
				no2=scanner.nextInt();
				
				int result=no1*no2;
				System.out.println("Multiplication="+result);
		}
}