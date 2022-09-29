import java.util.Scanner;
class lcm
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,hcf=0;
        double lcm;
        for(i=1;i<=a||i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                hcf=i;
            }
        }
        lcm=(a*b)/hcf;
        System.out.println("lcm of two numbers are:"+lcm);
    }
}