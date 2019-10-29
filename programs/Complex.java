import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Complex
{
    int real;
    int imaginary;
    private void getInputNo(Complex obj)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter real part: ");
        obj.real = Integer.parseInt(in.readLine());
        System.out.println("Enter imaginary part: ");
        obj.imaginary = Integer.parseInt(in.readLine());
    }
    private static Complex add(Complex obj1, Complex obj2)
    {
        Complex obj3 = new Complex();
        obj3.real = obj1.real + obj2.real;
        obj3.imaginary = obj1.imaginary + obj2.imaginary;
        return obj3;
    }
    private static void add(Complex obj)
    {
        String ans;
        ans = (obj.real)+" + "+(obj.imaginary)+"i";
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        obj1.getInputNo(obj1);
        obj2.getInputNo(obj2);
        Complex obj3 = new Complex();
        obj3 = (Complex) add(obj1,obj2);
        add(obj3);
    }
}
