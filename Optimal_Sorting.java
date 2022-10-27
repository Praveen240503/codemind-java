import java.util.*;
class Solutio {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            List<Integer> l=new ArrayList<>();
            int a=sc.nextInt();
            int[] arr=new int[a];
            for(int j=0;j<a;j++)
            {
                arr[j]=sc.nextInt();
            }
            int c=0;
            for(int k=1;k<a;k++)
            {
                if(arr[k-1]>arr[k])
                {
                    c++;
                }
            }
            if(c==0){
                System.out.println(c);
            }
            else
            {
                for(int t=0;t<a;t++)
                {
                    l.add(arr[t]);
                }
                int min=Collections.min(l);
                int max=Collections.max(l);
                System.out.println(max-min);
            }
            
        }
    }
}