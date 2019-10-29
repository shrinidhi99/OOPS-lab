import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Student
{
    int rollno;
    String name;
    int marks1,marks2,marks3;
    // default constructor
    public Student()
    {
        System.out.println("Null constructor called!");
        rollno = 1;
        name = "Shrinidhi";
        marks1 = 100;
        marks2 = 100;
        marks3 = 100;
    }
    // parameterized constructor
    public Student(int rno, String nam, int m1, int m2, int m3)
    {
        System.out.println("Parameterized constructor called!");
        rollno = rno;
        name = nam;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    public Student(Student obj1)
    {
        System.out.println("Copy constructor called!");
        rollno = obj1.rollno;
        name = obj1.name;
        marks1 = obj1.marks1;
        marks2 = obj1.marks2;
        marks3 = obj1.marks3;
    }
    void display()
    {
        System.out.println("Rollno.: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Marks 1: "+marks1);
        System.out.println("Marks 2: "+marks2);
        System.out.println("Marks 3: "+marks3);
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int r,M1,M2,M3;
        String n;
        System.out.println("Enter your rollno.: ");
        r = Integer.parseInt(in.readLine());
        System.out.println("Enter your name: ");
        n = in.readLine();
        System.out.println("Enter your marks1: ");
        M1 = Integer.parseInt(in.readLine());
        System.out.println("Enter your marks2: ");
        M2 = Integer.parseInt(in.readLine());
        System.out.println("Enter your marks3: ");
        M3 = Integer.parseInt(in.readLine());
        Student obj = new Student();
        obj.display();
        Student obj1 = new Student(r,n,M1,M2,M3);
        obj1.display();
        Student obj3 = new Student(obj1);
        Student obj4 = obj3;
        //System.out.println(obj4);
        obj4.display();
    }

}
