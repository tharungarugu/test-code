import java.util.*;
public class palindrome 
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the n value::");
            int n=sc.nextInt();
            int rev=0,temp,digit;
            temp=n;
            while(n>0)
            {
                digit=n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            if(temp==rev)
            {
                System.out.println("The given number is an palindrome number");

            }
            else
            {
                System.out.println("The given number is not an palindrome number");


            }
    }
    
}
