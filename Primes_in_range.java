import java.util.*;
class ArraySum
{
    public static boolean prime(int a){
        if(a==1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==true)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}