import java.util.Scanner;
class Diskcapacity
{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(2*a*b*c*512);
        System.out.println(d);
    }
}