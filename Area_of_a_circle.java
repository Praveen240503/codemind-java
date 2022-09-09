import java.util.Scanner;
import java.lang.Math;
class simpleinterest
{
	public static void main(String args[])
	{
		int a;
		double A,d=3.14;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
 	
 	    A=d*(a*a);
		
		System.out.format("%.2f",A);
		
		sc.close();
	}

}