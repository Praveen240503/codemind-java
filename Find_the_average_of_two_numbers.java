import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        double a,b,m;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        m=(a+b)/2;
        System.out.format("%.4f",m);
    }
}