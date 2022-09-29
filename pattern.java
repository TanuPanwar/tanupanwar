class pattern
{
    public static void main(String args[])
    {
        int i, j;
        for (i = 1; i < 10; i+=2)
        {
            if (i % 2 != 0)
            {
                for (j = i; j > 0; j -= 2)
                {
                    System.out.print(j);
                }
                System.out.println();
            } 
        }
    }
}
