import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Department
{
    String deptName = "CSE";
    String deptHead = "Dr.Alwyn R P";
    void details();
}
class Hostel
{
    String hostelName, hostelLocation;
    int numberOfRooms;
    void display(Student obj)
    {
        System.out.println("Hostel name: "+obj.hostelName);
        System.out.println("Number of rooms: "+obj.numberOfRooms);
        System.out.println("Hostel location: "+obj.hostelLocation);
    }
}
class Student extends Hostel implements Department
{
    String studentName, regNo, electiveCourse;
    float avgMarks;
    @Override
    public void details()
    {
        System.out.println("Department name: "+deptName);
        System.out.println("Department head: "+deptHead);
    }
    void display(Student obj)
    {
        Hostel obj1 = new Hostel();
        System.out.println("Name of the student: "+obj.studentName);
        System.out.println("Registration number: "+obj.regNo);
        System.out.println("Elective course: "+obj.electiveCourse);
        System.out.println("Average marks: "+obj.avgMarks);
        obj1.display(obj);
        obj.details();
    }
}
class Demo {
    public static void main(String[] args) throws IOException {
        Student[] obj = new Student[100];
        int numberOfStudents = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Enter:\n1.Admit new student\n2.Migrate a student\n3.Display details of a student");
            int ch = Integer.parseInt(in.readLine());
            if (ch == 4)
                break;
            switch (ch) {
                case 1: {

                    System.out.println("Enter the details of the student: ");
                    obj[numberOfStudents] = new Student();
                    System.out.println("Enter name of the student: ");
                    obj[numberOfStudents].studentName = in.readLine();
                    System.out.println("Enter registration number: ");
                    obj[numberOfStudents].regNo = in.readLine();
                    System.out.println("Enter elective course: ");
                    obj[numberOfStudents].electiveCourse = in.readLine();
                    System.out.println("Enter average marks: ");
                    obj[numberOfStudents].avgMarks = Float.parseFloat(in.readLine());
                    System.out.println("Enter hostel name: ");
                    obj[numberOfStudents].hostelName = in.readLine();
                    System.out.println("Enter number of rooms: ");
                    obj[numberOfStudents].numberOfRooms = Integer.parseInt(in.readLine());
                    System.out.println("Enter hostel location: ");
                    obj[numberOfStudents].hostelLocation = in.readLine();
                    numberOfStudents += 1;
                    break;
                }
                case 2: {
                    int i;
                    String name;
                    System.out.println("Enter the student name who wants to migrate: ");
                    name = in.readLine();
                    for (i = 0; i < numberOfStudents; i++) {
                        if (name.equals(obj[i].studentName)) {
                            System.out.println("Enter the new hostel name: ");
                            obj[i].hostelName = in.readLine();
                            System.out.println("Enter the new number of rooms: ");
                            obj[i].numberOfRooms = Integer.parseInt(in.readLine());
                            System.out.println("Enter the new hostal location: ");
                            obj[i].hostelLocation = in.readLine();
                            System.out.println("Student migrated!");
                            break;
                        }
                    }
                    if(i==numberOfStudents)
                    System.out.println("No such students exists in our record!");
                    break;
                }
                case 3: {
                    System.out.println("Enter name of the student whose details is to be fetched: ");
                    String name = in.readLine();
                    int i;
                    for (i = 0; i < numberOfStudents; i++) {
                        if (name.equals(obj[i].studentName)) {
                            obj[i].display(obj[i]);
                            break;
                        }
                    }
                    System.out.println("No such student exists in our record!");
                    break;
                }
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}