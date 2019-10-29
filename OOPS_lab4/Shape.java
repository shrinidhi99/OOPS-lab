import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract public class Shape
{
    int a,b;
    abstract void Area(int a,int b);
}
class Circle extends Shape
{
    void Area(int a, int b)
    {
        int res = (int) (3.14 * a * b);
        System.out.println("The area of circle of radius "+a+" => "+res);
    }
}
class rectangle extends Shape
{
    void Area(int a, int b)
    {
        int res = a*b;
        System.out.println("The area of rectangle with length = "+a+" and breadth = "+b+" => "+res);
    }
}
class triangle extends Shape
{
    void Area(int a, int b)
    {
        int res = (int) (0.5*a*b);
        System.out.println("The area of triangle with base = "+a+" and height = "+b+" => "+res);
    }
}
class test
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter:\n1.Area of circle\n2.Area of rectangle\n3.Area of triangle\n");
        int ch = Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
            {
                int r;
                System.out.println("Enter radius:\n");
                r = Integer.parseInt(in.readLine());
                Shape obj1 = new Circle();
                obj1.Area(r,r);
                break;
            }
            case 2:
            {
                int a,b;
                System.out.println("Enter length and breadth:\n");
                a = Integer.parseInt(in.readLine());
                b = Integer.parseInt(in.readLine());
                Shape obj2 = new rectangle();
                obj2.Area(a,b);
                break;
            }
            case 3:
            {
                int b,h;
                System.out.println("Enter base and height:\n");
                b = Integer.parseInt(in.readLine());
                h = Integer.parseInt(in.readLine());
                Shape obj3 = new triangle();
                obj3.Area(b,h);
                break;
            }
            default:
                System.out.println("Wrong choice!\n");
        }
    }
}