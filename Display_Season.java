import java.util.Scanner;
class season{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==1 || n==12 || n==11){
           System.out.println("Winter"); 
        }
        if(n==4 || n==5 || n==6){
           System.out.println("Summer"); 
        }
        if(n==2 || n==3 ){
           System.out.println("Spring"); 
        }
        if(n==7 || n==8 || n==9 || n==10){
           System.out.println("Rainy"); 
        }
        if(n<1 || n>12)
        {
            System.out.printf("-1");
        }
    }
}