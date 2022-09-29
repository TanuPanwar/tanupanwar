import java.util.Scanner;
class menu_driven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PRESS 1 if you want to calculate factorial of a number.");
        System.out.println("PRESS 2 if you want to enterd a number is a prime number or not.");
        System.out.println("PRESS 3 if you want to check whether the number is odd or even.");
        System.out.println("PRESS 4 TO EXIT.");
        System.out.println("please enter your choice: ");
        int choice=sc.nextInt();
        while(1>0&&choice<=3)
        {
            System.out.println("PRESS 1 if you want to calculate factorial of a number.");
            System.out.println("PRESS 2 if you want to enterd a number is a prime number or not.");
            System.out.println("PRESS 3 if you want to check whether the number is odd or even.");
            System.out.println("please enter your choice: ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    int fact=1;
                    System.out.println("Enter the number whose factorial you want to calculate: ");
                    int num=sc.nextInt();
                    for(int i = 1;i<=num;i++)
                    {
                        fact=fact*i;
                    }
                    System.out.println("Factorial of a number is: "+fact);
                    continue;
                }
                case 2:
                {
                    System.out.println("Enter the number which you want to check for prime: ");
                    int num=sc.nextInt();
                    for(int i=2;i<=5;i++)
                    {
                        if(num%i==0&&num!=2&&num!=3&&num!=5)
                        {
                            System.out.println("number is not prime.");
                            break;
                        }
                        else
                        {
                            System.out.println("number is prime.");
                            break;
                        }
                    }
                    continue;
                }
                case 3:
                {
                    System.out.println("enter tne number which you want to check for odd or ever: ");
                    int num=sc.nextInt();
                    if(num%2==0)
                    {
                        System.out.println("Entered number is even.");
                    }
                    else
                    {
                        System.out.println("Entered number is odd.");
                    }
                    continue;
                }
                default:
                {
                    break;
                }
            }
        }
    }
}
 