import java.util.*;
class Solutio {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.nextLine().charAt(0);
        if(c=='V' || c=='v'){
            System.out.print("Violet");
        }
        else if(c=='I' || c=='i'){
            System.out.print("Indigo");
        }
        else if(c=='B' || c=='b'){
            System.out.print("Blue");
        }
        else if(c=='G' || c=='g'){
            System.out.print("Green");
        }
        else if(c=='y' || c=='Y'){
            System.out.print("Yellow");
        }
        else if(c=='o' || c=='O'){
            System.out.print("Orange");
        }
        else if(c=='R' || c=='r')
            System.out.println("Red");
        else{
            System.out.print("-1");
        }
    }
}