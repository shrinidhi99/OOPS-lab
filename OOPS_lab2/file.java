import java.io.*;
import java.util.*;
public class file
{
    public static void main(String[] args)throws IOException
    {
        String message;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message to be written into a file:\n");
        message = in.readLine();
        PrintWriter writer = new PrintWriter("filejava.txt", "UTF-8");
        writer.println(message);
        writer.close();
    }
}
