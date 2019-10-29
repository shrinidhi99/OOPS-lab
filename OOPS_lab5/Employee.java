import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee
{
    String name;
    String designation;
    double salary;
}
class Manager extends Employee
{
    String department;
    void Display(Manager obj)
    {
        System.out.println("Manager's name: "+obj.name);
        System.out.println("Manager's department: "+obj.department);
        System.out.println("Manager's salary: "+obj.salary);
    }
}
class Executive extends Manager
{
    void show(Manager obj)
    {
        Manager ex = new Manager();
        System.out.println("Executive");
        ex.Display(obj);
    }
}
class Test2
{
    public static void main(String[] args)throws IOException
    {
        Manager obj = new Manager();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        obj.name = in.readLine();
        System.out.println("Enter your designation: ");
        obj.designation = in.readLine();
        System.out.println("Enter your department: ");
        obj.department = in.readLine();
        System.out.println("Enter your salary: ");
        obj.salary = Double.parseDouble(in.readLine());
        obj.Display(obj);
        Executive obj2 = new Executive();
        obj2.show(obj);
    }

}
