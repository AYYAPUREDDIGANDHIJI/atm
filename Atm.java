
import java.util.*;
class Atm1
{
    Scanner sc=new Scanner(System.in);
    int pin=1234;
    float balance=10000.0;
    public void checkpin()
    {
      System.out.println("enter ATM pin");
      int yourpin=sc.nextInt();
      if(yourpin==pin)
      {
        System.out.println("WELCOME");
        choice();
      }
      else
      {
        System.out.println("enter valid pin");

      }
    } 
    public void choice()
    {
        System.out.println("enter 1 to check balance");
        System.out.println("enter 2 to Deposit money");
        System.out.println("enter 3 to withdraw money");
        System.out.println("enter 4 to exit");
        int c=sc.nextInt();
        if(c==1)
        {
            System.out.println("your account balance is"+balance);
            choice();
        }
        else if(c==2)
        {
            System.out.println("enter amount to deposit");
            int amount=sc.nextInt();
            balance=balance+amount;
            System.out.println("your amount is successfully deposited");
            choice();

        }
        else if(c==3)
        {
            System.out.println("enter amount to withdraw");
            int amt=sc.nextInt();
            if(amt>balance)
            {
                System.out.println("insufficient balance");
            }
            else
            {
              balance=balance-amt;
              System.out.println("your amount is successfully withdraw from your account");

            }
            choice();


        }
        else if(c==4)
        {
            return;
        }
        else{
            System.out.println("please enter valid option");
            choice();
        }
    }
}

class Atm
{
    public static void main(String args[])
    {
       Atm1 o = new Atm1();
       o.checkpin();
    }
}