import java.util.Scanner;
public class hcf
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,hcf=0;
        for(i=1;i<=a||i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("Highest common factore of"+a+"and"+b+"is"+hcf);
    }
}