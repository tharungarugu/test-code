import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n value::");
        int n=s.nextInt();
        int sum =0;
        int temp=n;
        while(n>0)
        {
            int digit=n%10;
            sum=sum*10+digit*digit*digit;
            n=n/10;

        }
        if(temp==sum)
        {
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}