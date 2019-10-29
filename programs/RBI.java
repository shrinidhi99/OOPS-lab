import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RBI
{
    double minInterestRate;
    double minBalance;
    double maxWithdrawalLimit;
    RBI()
    {
        minInterestRate = 8.0;
        minBalance = 1000.00;
        maxWithdrawalLimit = 25000.00;
    }
}
class PNB extends RBI
{
    PNB(Customer obj)
    {
        if(obj.minInterestRate > 8.0)
        {
            this.minInterestRate = 9.0;
        }
        else
            this.minInterestRate = 8.0;
        if(obj.minBalance > 1000.00)
            this.minBalance = 2000.00;
        else
            this.minBalance = 1000.00;
        if(obj.maxWithdrawalLimit < 25000.00)
        {
            this.maxWithdrawalLimit = 20000.00;
        }
        else
            this.maxWithdrawalLimit = 25000.00;
    }

    public void display() throws IOException
    {
        System.out.println("Thanks for choosing PNB!");
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter the balance left in your PNB account: ");
        double b = Double.parseDouble(in.readLine());
        System.out.println("How much amount do you want to withdraw? ");
        double w = Double.parseDouble(in.readLine());
        if(w <= b && (b-w) >= this.minBalance && w < this.maxWithdrawalLimit)
        {
            b = b - w;
            System.out.println("Transaction successful!\nBalance left: "+b);
        }
    }
}
class ICICI extends RBI
{
    ICICI(Customer obj)
    {
        if(obj.minInterestRate > 8.0)
        {
            this.minInterestRate = 10.0;
        }
        else
            this.minInterestRate = 8.0;
        if(obj.minBalance > 1000.00)
        {
            this.minBalance = 3000.00;
        }
        else
            this.minBalance = 1000.00;
        if(obj.maxWithdrawalLimit < 25000.00)
        {
            this.maxWithdrawalLimit = 10000.00;
        }
        else
            this.maxWithdrawalLimit = 25000.00;
    }
    public void display() throws IOException
    {
        System.out.println("Thanks for choosing ICICI!");
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter the balance left in your ICICI account: ");
        double b = Double.parseDouble(in.readLine());
        System.out.println("How much amount do you want to withdraw? ");
        double w = Double.parseDouble(in.readLine());
        if(w <= b && (b-w) >= this.minBalance && w < this.maxWithdrawalLimit)
        {
            b = b - w;
            System.out.println("Transaction successful!\nBalance left: "+b);
        }
    }
}
class SBI extends RBI
{
    SBI(Customer obj)
    {
        if (obj.minInterestRate > 8.0)
        {
            this.minInterestRate = 10.0;
        }
        else
            this.minInterestRate = 8.0;
        if(obj.minBalance > 1000.00)
        {
            this.minBalance = 3000.00;
        }
        else
            this.minBalance = 1000.00;
        if (obj.maxWithdrawalLimit < 25000.00)
        {
            this.maxWithdrawalLimit = 10000.00;
        }
        else
            this.maxWithdrawalLimit = 25000.00;
    }
    public void display() throws IOException
    {
        System.out.println("Thanks for choosing SBI!");
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter the balance left in your SBI account: ");
        double b = Double.parseDouble(in.readLine());
        System.out.println("How much amount do you want to withdraw? ");
        double w = Double.parseDouble(in.readLine());
        if(w <= b && (b-w) >= this.minBalance && w < this.maxWithdrawalLimit)
        {
            b = b - w;
            System.out.println("Transaction successful!\nBalance left: "+b);
        }
    }
}
class Customer
{
    String name;
    double minBalance;
    double maxWithdrawalLimit;
    double minInterestRate;
    Customer()
    {

    }
}
class Account extends Customer
{
    Account()
    {

    }

    public static void main(String[] args)throws IOException
    {
        String name;
        double minBalance;
        double maxWithdrawalLimit;
        double minInterestRate;
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter your name: ");
        name = in.readLine();
        System.out.println("Enter minBalance: ");
        minBalance = Double.parseDouble(in.readLine());
        System.out.println("Enter maxWithdrawalLimit: ");
        maxWithdrawalLimit = Double.parseDouble(in.readLine());
        System.out.println("Enter minInterestRate: ");
        minInterestRate = Double.parseDouble(in.readLine());
        RBI obj = new RBI();
        System.out.println("Enter:\n1.PNB\n2.ICICI\n3.SBI\n");
        int ch = Integer.parseInt(in.readLine());
        if(ch == 1)
        {
            Customer cust = new Customer();
            cust.name = name;
            cust.minInterestRate = minInterestRate;
            cust.maxWithdrawalLimit = maxWithdrawalLimit;
            cust.minBalance = minBalance;
            PNB pnb = new PNB(cust);
            pnb.display();
        }
        else if(ch == 2)
        {
            Customer cust = new Customer();
            cust.name = name;
            cust.minInterestRate = minInterestRate;
            cust.maxWithdrawalLimit = maxWithdrawalLimit;
            cust.minBalance = minBalance;
            ICICI icici = new ICICI(cust);
            icici.display();
        }
        else if(ch == 3)
        {
            Customer cust = new Customer();
            cust.name = name;
            cust.minInterestRate = minInterestRate;
            cust.maxWithdrawalLimit = maxWithdrawalLimit;
            cust.minBalance = minBalance;
            SBI sbi = new SBI(cust);
            sbi.display();
        }
        else
            System.out.println("No such bank exists!");
    }

}