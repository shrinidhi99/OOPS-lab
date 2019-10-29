import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileper
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a filename: ");
        String filename = in.readLine();
        filename = "/home/student/IdeaProjects/OOPS_lab4/src/" + filename + ".java";
        File tempFile = new File(filename);
        boolean exists = tempFile.exists();
        if(exists)
        {
            System.out.println("The file "+filename+" exists.");
            System.out.println("Executable: "+tempFile.canExecute());
            System.out.println("Readable: "+tempFile.canRead());
            System.out.println("Writable: "+tempFile.canWrite());
            System.out.println("Size: "+tempFile.length());
        }
        else
            System.out.println("The file doesn't exist!\n");
    }
}
