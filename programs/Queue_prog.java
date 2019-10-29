import java.io.*;
public class Queue_prog
{
    public static void main(String[] args)throws IOException {
        int[] q = new int[20];
        int i, N, front = -1, rear = -1;
        System.out.println("Enter the size of the queue: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        for (i = 1; i <= 15; i++) {
            System.out.println("Enter:\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Terminate operation\n");
            int ch = Integer.parseInt(in.readLine());
            if (ch == 1) {
                System.out.println("Enter an element to be enqueued: ");
                if(rear < N && front == -1) {
                    q[++rear] = Integer.parseInt(in.readLine());
                    ++front;
                }
                else if(rear < N)
                {
                    q[++rear] = Integer.parseInt(in.readLine());
                }

                else
                    System.out.println("Queue is full!\n");

                System.out.println("Queue is: ");
                for(int j=front;j<=rear;j++)
                    System.out.print(q[j] + " ");
            }
            else if (ch == 2) {
                if(front>=0 && front<=rear)
                    ++front;
                else
                    System.out.println("Queue is empty!\n");
                for(int k=front;k<=rear;k++)
                    System.out.print(q[k] + " ");
            }
            else if(ch == 3)
            {
                if(front>0)
                System.out.println("The rear element is " + q[rear] + ".\n");
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

