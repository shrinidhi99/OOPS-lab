import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator
{
    public Calculator()
    {

    }
    float sum(float a, float b, char op)
    {
        return a+b;
    }
    float subtract(float a, float b, char op)
    {
        return a-b;
    }
    float multiply(float a, float b, char op)
    {
        return a*b;
    }
    float divide(float a, float b, char op)
    {
        return a/b;
    }
    public static void main(String[] args)throws IOException
    {
        float a,b,c;
        char op;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter operand 1: ");
        a = Float.parseFloat(in.readLine());
        System.out.println("Enter  an operator: ");
        op = (char)(in.readLine().charAt(0));
        System.out.println("Enter operand 2: ");
        b = Float.parseFloat(in.readLine());
        Calculator obj = new Calculator();
        switch(op)
        {
            case '+':
            {
                c = obj.sum(a,b,op);
                System.out.println(a+" "+op+" "+b+" = "+c);
                break;
            }
            case '*':
            {
               c = obj.multiply(a,b,op);
                System.out.println(a+" "+op+" "+b+" = "+c);
                break;
            }
            case '-':
            {
                c = obj.subtract(a,b,op);
                System.out.println(a+" "+op+" "+b+" = "+c);
                break;
            }
            case '/':
            {
                if(b!=0)
                {
                    c = obj.divide(a,b,op);
                    System.out.println(a + " " + op + " " + b + " = " + c);
                }
                else
                    System.out.println("Cannot divide a number by 0!");
                break;
            }
            default:
                System.out.println("Invalid operator!");
        }
    }
}
