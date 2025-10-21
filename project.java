import java.util.*;
class CircularPrime
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=in.nextInt();
        int temp=n,k=0;
        String s=""+n;
        int lnd,fnd;
        for(int i=0;i<s.length();i++)
        {
            lnd=temp%(int)(Math.pow(10,s.length()-1));
            fnd=temp/(int)(Math.pow(10,s.length()-1));
            temp=lnd*10+fnd;
            System.out.print(temp);
            int c=0;
            for(int j=1;j<=temp;j++)
            {
                if(temp%j==0)
                c++;
            }
            if(c==2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not a prime");
                k++;
            }
        }
        if(k==0)
        {
            System.out.println("Cp no.");
        }
        else
        {
            System.out.println("Not a Cp no.");
        }
    }
}