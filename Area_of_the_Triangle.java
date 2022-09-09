import java.util.Scanner;
import java.lang.Math;
class simpleinterest
{
	public static void main(String args[])
	{
		double I,p,t,r,s;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
 		t=sc.nextInt();
		r=sc.nextInt();
 		
 		s=(p+t+r)/2;
 	    I=Math.sqrt(s*(s-p)*(s-t)*(s-r));
		
		System.out.format("%.2f",I);
		
		sc.close();
	}

}