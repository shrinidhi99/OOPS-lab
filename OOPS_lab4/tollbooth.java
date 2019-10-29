import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tollbooth
{
    int toll;
    double amount;
    public tollbooth()
    {
        toll = 0;
        amount = 0;
    }
    void paying_vehicle(int v_t,double c_t)
    {
        v_t += 1;
        c_t = c_t + 50;
        toll = v_t;
        amount = c_t;
    }
    void non_paying_vehicle(int v_t, double c_t)
    {
        v_t += 1;
        toll = v_t;
        amount = c_t;
    }
    void display(tollbooth a)
    {
        System.out.println("Vehicle total = "+a.toll);
        System.out.println("Cash total = "+a.amount);
    }
    public static void main(String[] args)throws IOException
    {
            int v_t;
            double c_t;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter vehicle total: ");
        v_t = Integer.parseInt(in.readLine());
        System.out.println("Enter cash total: ");
        c_t = Double.parseDouble(in.readLine());
        tollbooth a = new tollbooth();
        a.paying_vehicle(v_t,c_t);
        tollbooth b = new tollbooth();
        b.non_paying_vehicle(v_t,c_t);
        System.out.println("Paying vehicles\n");
        a.display(a);
        System.out.println("Non paying vehicles\n");
        b.display(b);
    }
}
