import java.io.*;
public class stack_prog
{
    public static void main(String[] args)throws IOException {
        int[] stack = new int[20];
        int i, N, top = -1;
        System.out.println("Enter the size of the stack: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        for (i = 1; i <= 15; i++) {
            System.out.println("Enter:\n1.Push\n2.Pop\n3.Peek\n4.Terminate operation\n");
            int ch = Integer.parseInt(in.readLine());
            if (ch == 1) {
                System.out.println("Enter an element to be pushed: ");
                if(top < N)
                stack[++top] = Integer.parseInt(in.readLine());
                else
                    System.out.println("Stack is full!\n");
                System.out.println("Stack is: ");
                for(int j=0;j<=top;j++)
                    System.out.println(stack[j] + " ");
            }
            else if (ch == 2) {
                if(top>=0)
                    --top;
                else
                    System.out.println("Stack is empty!\n");
                for(int k=0;k<=top;k++)
                    System.out.println(stack[k] + " ");
            }
            else if(ch == 3)
            {
                System.out.println("The stack top is " + stack[top] + ".\n");
            }
            else if(ch == 4)
            {
                break;
            }
            else
                System.out.println("Invalid choice!\n");
        }
    }
}
