import java.util.*;
class Main1
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(fib(n));
    }
}