public class Main
{
    public static void main(String[] args)
    {
        int numToExamine = 2;
        int parityOfNum = 0;

        parityOfNum = numToExamine % 2;

        if (parityOfNum == 0)
        {
            System.out.println("Since the remainder of " + numToExamine + " / 2 is " + parityOfNum + ", the number is even!");
        }
        else
        {
            System.out.println("Since the remainder of " + numToExamine + " / 2 is " + parityOfNum + ", the number is odd!");
        }

    }
}