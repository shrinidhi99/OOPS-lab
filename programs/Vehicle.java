import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vehicle
{
    protected int regNumber, mileage;
    protected String color, ownerName;
    void showData()
    {
        System.out.println("This is a vehicle class");
    }
}
class Bus extends Vehicle
{
    private int routeNumber;
    void showData(Bus obj) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter route number: ");
        obj.routeNumber = Integer.parseInt(in.readLine());
        Vehicle s = new Vehicle();
        System.out.println("regNumber: "+obj.regNumber);
        System.out.println("Mileage: "+obj.mileage);
        System.out.println("Color: "+obj.color);
        System.out.println("Owner name: "+obj.ownerName);
        System.out.println("Route number: "+obj.routeNumber);
        s.showData();
    }
}
class Car extends Vehicle
{
    private String manufacturerName;
    void showData(Car obj) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter route number: ");
        obj.manufacturerName = in.readLine();
        Vehicle s = new Vehicle();
        System.out.println("regNumber: "+obj.regNumber);
        System.out.println("Mileage: "+obj.mileage);
        System.out.println("Color: "+obj.color);
        System.out.println("Owner name: "+obj.ownerName);
        System.out.println("Manufacturer name: "+obj.manufacturerName);
        s.showData();
    }
}
class Test
{
    public static void main(String[] args)throws IOException
    {
        Test obj = new Test();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Bus details: ");
        Bus obj1 = new Bus();
        System.out.println("Enter regNumber: ");
        obj1.regNumber = Integer.parseInt(in.readLine());
        System.out.println("Enter mileage: ");
        obj1.mileage = Integer.parseInt(in.readLine());
        System.out.println("Enter color: ");
        obj1.color = in.readLine();
        System.out.println("Enter owner name: ");
        obj1.ownerName = in.readLine();
        obj1.showData(obj1);
        System.out.println("Enter Car details: ");
        Car obj2 = new Car();
        System.out.println("Enter regNumber: ");
        obj2.regNumber = Integer.parseInt(in.readLine());
        System.out.println("Enter mileage: ");
        obj2.mileage = Integer.parseInt(in.readLine());
        System.out.println("Enter color: ");
        obj2.color = in.readLine();
        System.out.println("Enter owner name: ");
        obj2.ownerName = in.readLine();
        obj2.showData(obj2);

    }
}

