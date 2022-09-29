import java.util.*;
class Solution
{
	public static void main (String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a-->0)
		{
		    double a1 = sc.nextInt();
		    double a2 = sc.nextInt();
		    double b1 = sc.nextInt();
		    double b2 = sc.nextInt();
		    double x = b1/a1;
		    double y = b2/a2;
		     
		     if(x<y){
		         System.out.println("-1");
		     }
		     else{
		         if(x>y)
		         System.out.println("1");
		         else 
		         System.out.println("0");
		     }
		}
	}
}