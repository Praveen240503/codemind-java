import java.util.Scanner;
class elec_bill{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();
        double d=0,s=0;
        if(c<200){
            d=c*1.20;
        }
        if(c>=200&& c<400)
        {
            d=c*1.50;
        }
        if(c>=400 && c<600)
        {
            d=c*1.80;
        }
        if(c>=600)
        {
            d=c*2.00;
        }
        if(d>400)
        {
            s=d+(d*0.15);
        }
        else
        {
            s=d+100;
        }
        System.out.printf("%.2f",s);
    }
}