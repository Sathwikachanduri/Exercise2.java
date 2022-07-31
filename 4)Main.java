import java.util.*;
 
class Main {

    public static int findMaxRec(int a[], int n)
    {

    if(n == 1)
        return a[0];
    else 
    {
    
        return Math.max(a[n-1], findMaxRec(a, n-1));
    }
    }
 

    public static void main(String args[])

    {
        Scanner ob=new Scanner(System.in); 
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++) 
        {
            a[i]=ob.nextInt();
        }
      
        System.out.println(findMaxRec(a, n));
    }
}
