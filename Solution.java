import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        if(q>=0&&q<=500)
        
        {
            for(int i=0;i<q;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int n=sc.nextInt();
                int sum=a+b;
                for(int j=1;j<n;j++)
                {
                    sum=sum+(int)(Math.pow(2,j)*b);
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
        }
    }
}
