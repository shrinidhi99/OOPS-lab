import java.io.*;

public class Program1
{
    public static void main(String[] args)throws IOException
    {
        String msg;
        System.out.println("Enter some message: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        msg = read.readLine();
        System.out.println(msg);
    }
}
