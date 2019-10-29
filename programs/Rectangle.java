import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle
{
    double length,width,area;
    String color;
    void set_length(double l)
    {
        length = l;
    }
    void set_width(double w)
    {
        width = w;
    }
    void set_color(String c)
    {
        color = c;
    }
    void find_area()
    {
        area = (length)*(width);
    }

    public static void main(String[] args)throws IOException
    {
        double l,w,a;
        String c;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of rectangle 1: ");
        l = Double.parseDouble(in.readLine());
        System.out.println("Enter width of rectangle 1: ");
        w = Double.parseDouble(in.readLine());
        System.out.println("Enter color of rectangle 1: ");
        c = in.readLine();
        Rectangle rec1 = new Rectangle();
        rec1.set_length(l);
        rec1.set_width(w);
        rec1.set_color(c);
        rec1.find_area();
        System.out.println("Enter length of rectangle 2: ");
        l = Double.parseDouble(in.readLine());
        System.out.println("Enter width of rectangle 2: ");
        w = Double.parseDouble(in.readLine());
        System.out.println("Enter color of rectangle 2: ");
        c = in.readLine();
        Rectangle rec2 = new Rectangle();
        rec2.set_length(l);
        rec2.set_width(w);
        rec2.set_color(c);
        rec2.find_area();
        if((rec1.area == rec2.area))
        {
            if((rec1.color).equals(rec2.color))
            System.out.println("Matching rectangles");
            else
                System.out.println("Non Matching rectangles");
        }
        else
            System.out.println("Non Matching rectangles");
    }
}
