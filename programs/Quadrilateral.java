import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

class Quadrilateral
{
    float x1,y1,x2,y2,x3,y3,x4,y4;
}
class Trapezoid extends Quadrilateral
{
    void Area(float x1,float x2,float x3,float x4, float y1, float y2, float y3, float y4)
    {
        float area = (float) abs((0.5)*(x1-x2)*(x3-x4)*(y1-y4));
        System.out.println("Area of trapezoid = "+area+" square units.\n");
    }
}
class Parallelogram extends Quadrilateral
{
    void Area(float x1,float x2,float x3,float x4, float y1, float y2, float y3, float y4)
    {
        float area = abs((x1-x2)*(y1-y4));
        System.out.println("Area of parallelogram = "+area+" square units.\n");
    }
}
class Rectangle extends Parallelogram
{
    void Area(float x1,float x2,float x3,float x4, float y1, float y2, float y3, float y4)
    {
        float area = abs((x1-x2)*(y2-y3));
        System.out.println("Area of rectangle = "+area+" square units.\n");
    }
}
class Square extends Parallelogram
{
    void Area(float x1,float x2,float x3,float x4, float y1, float y2, float y3, float y4)
    {
        float area = abs((x1-x2)*(x1-x2));
        System.out.println("Area of square = "+area+" square units.\n");
    }
}
class Test
{
    private float dis(float x1, float y1, float x2, float y2)
    {
        return (abs((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
    }
    public static void main(String[] args) throws IOException {
        float x1,x2,x3,x4,y1,y2,y3,y4;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter four set of cartesian coordinates in the order (x1,y1) , (x2,y2) , (x3,y3) , (x4,y4):\n");
        x1 = Float.parseFloat(in.readLine());
        y1 = Float.parseFloat(in.readLine());
        x2 = Float.parseFloat(in.readLine());
        y2 = Float.parseFloat(in.readLine());
        x3 = Float.parseFloat(in.readLine());
        y3 = Float.parseFloat(in.readLine());
        x4 = Float.parseFloat(in.readLine());
        y4 = Float.parseFloat(in.readLine());
        Test obj = new Test();
        if(abs(x1-x2) == abs(x4-x3) && abs(y1-y4) == abs(x3-x4))
        {
            //then it is a square
            Square sq = new Square();
            sq.Area(x1,x2,x3,x4,y1,y2,y3,y4);
        }
        else if(abs(x1-x2) == abs(x3-x4) && abs(y1-y4) == abs(y2-y3) && obj.dis(x1,y1,x3,y3) == obj.dis(x2,y2,x4,y4))
        {
            //then it is a rectangle
            Rectangle rec = new Rectangle();
            rec.Area(x1,x2,x3,x4,y1,y2,y3,y4);
        }
        else if(abs(x1-x2) == abs(x4-x3) && abs(y1-y4) == abs(y2-y3))
        {
            //then it is a parallelogram
            Parallelogram par = new Parallelogram();
            par.Area(x1,x2,x3,x4,y1,y2,y3,y4);
        }
        else
        {
            //it is a trapezoid
            Trapezoid tp = new Trapezoid();
            tp.Area(x1,x2,x3,x4,y1,y2,y3,y4);
        }
    }
}