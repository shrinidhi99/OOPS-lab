import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Database
{
    String name;
    String travelStartDate;
    String travelReturnDate;
    String placeVisited;
    void data(Age obj)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        obj.name = in.readLine();
        System.out.println("Enter your travel start date: ");
        obj.travelStartDate = in.readLine();
        System.out.println("Enter place you visited: ");
        obj.placeVisited = in.readLine();
        System.out.println("Enter your return date: ");
        obj.travelReturnDate = in.readLine();
    }
}
class Age extends Database
{
    int age;
    void year(Age obj)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        obj.age = Integer.parseInt(in.readLine());
    }
}
class Test3
{
    public static void main(String[] args)throws IOException
    {
        int N,i;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of people: ");
        N = Integer.parseInt(in.readLine());
        Age[] people = new Age[N];
        for(i=0;i<N;i++)
        {
            people[i] = new Age();
            people[i].data(people[i]);
            people[i].year(people[i]);
        }
        for(i=0;i<N;i++)
        {
            if(people[i].age < 12)
            {
                System.out.println("Your name: "+people[i].name);
                System.out.println("Your travel start date: "+people[i].travelStartDate);
                System.out.println("Your place of visited: "+people[i].placeVisited);
                System.out.println("Your return date: "+people[i].travelReturnDate);
                System.out.println("Your age: "+people[i].age);
            }
        }
    }
}