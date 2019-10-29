import javax.xml.soap.SOAPPart;
import java.io.*;
import java.util.*;
public class Name
{
    public Name()
    {

    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N,i,j;
        String name[] = new String[50];
        String temp;
        System.out.println("Enter the number of names to be inputted: ");
        N = Integer.parseInt(in.readLine());
        System.out.println("Enter "+N+" names:\n");
        for(i=0;i<N;i++)
        {
            name[i] = in.readLine();
        }
        System.out.println("Enter\n1.Ascending order\n2.Descending order\n");
        int choice = Integer.parseInt(in.readLine());
        switch(choice) {
            case 1: {
                //compare and sort
                for (i = 0; i < N; i++) {
                    for (j = 0; j < N - i - 1; j++) {
                        if (name[j].compareTo(name[j + 1]) > 0) {
                            temp = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = temp;
                        }
                    }
                }
                System.out.println("The names in ascending order is:\n");
                for (i = 0; i < N; i++)
                    System.out.println(name[i]);

                break;

            }
            case 2: {
                //compare and sort
                for (i = 0; i < N; i++) {
                    for (j = 0; j < N - i - 1; j++) {
                        if (name[j].compareTo(name[j + 1]) < 0) {
                            temp = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = temp;
                        }
                    }
                }
                System.out.println("The names in descending order is:\n");
                for (i = 0; i < N; i++)
                    System.out.println(name[i]);
                break;
            }
            default:
                System.out.println("Wrong choice!\n");
        }
    }
}
