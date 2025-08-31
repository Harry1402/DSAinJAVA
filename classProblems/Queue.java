import java.io.*;
import java.util.Queue;

class queue
{
    private int a[];
    private int size;
    private int front , rear;

    queue(int s)
    {
        a = new int[s];
        size = s;
        front = rear = -1;
    }
     int isEmpty()
     {
        if((front == -1) && (rear == -1))
            return 1;
        else
            return 0;
     }

     int isFull()
     {
        if(rear == size-1)
            return 1;
        else  
            return 0;
     }

     void enque(int x)
     {
        if(isFull() == 1)
        {
            System.out.println("Queue is Full");
        }
        else
            {
                if(isEmpty() == 1)
                {
                    rear = front = 0;
                    a[rear] = x;
                }
                else
                {
                    rear++;
                    a[rear] = x;
                }
            }
     }

     int deque()
     {
        if( isEmpty() == 1)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
        {
            int x = a[front];
            if(front == rear)
            {
                front = rear = -1;
              
            }
            else
            {
                front++;
            }
              return x;
        }
     }

     public static void main(String[] args) {
        
        queue q = new queue(5);

        q.deque();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);

        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
     }
}