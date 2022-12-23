package ca;
import java.util.*;
class cal
{
    public static void main(String []arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        boolean f=true;
        int []a=new int[n];
        int []b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); 
        }
        for(i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(i=0;i<n;i++)
        {
            if(b[i]!=a[i])
            {
                f=false;
                break;
            }
        }
        if(f)
        {
          System.out.print("Sorted");
        }
        if(!f)
        {
            for(j=0,i=n-1;i>=0;i--,j++)
            if(b[i]!=a[j])
            {
                f=false;
                break;
            }
            else
            {
                f=true;
            }
            System.out.print(f?"Sorted":"Unsorted");
        }
       
        
    }
}