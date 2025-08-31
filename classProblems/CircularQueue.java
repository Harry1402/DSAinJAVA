import java.io.*;

class CircularQueue
{
    int a[];
    int front, rear , size;


    CircularQueue(int s)
    {
        a = new int[s];
        front = -1;
        rear = -1;
        size = s;
    }


    int isFull()
    {
        if((rear+1)%size == front)
            return 1;
        else
            return 0;
    }

    int isEmpty()
    {
        if(front == -1 && rear == -1)
            return 1;
        else
            return 0;
    }

    void equeue(int value)
    {

        if(isFull() == 1)
        {
            System.out.println("Queue is Full");
        }
        else if( isEmpty() == 1)
        {
           front++;
           rear++;
           a[rear] = value; 
        }
        else
        {
            if(isFull() != 1)
            {
                rear = (rear+1)%size;
                a[rear] = value;
            }
        }
    }

    void dequeue()
    {
        if(isEmpty() == 1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println(a[front] + " Deleted");

            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else{
                front = (front+1)%size;
            }
        }
    }

    int getFront()
    {
        if(isEmpty() == 1)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
        return a[front]; 
    }

    public static void main(String[] args) {
        

        CircularQueue q = new CircularQueue(5);

        q.equeue(10);
        q.equeue(20);
        q.equeue(30);
        q.equeue(40);
        q.equeue(50);

        q.dequeue();

        q.equeue(60);


        while(q.isEmpty() != 1)
        {
            System.out.println(q.getFront() + " ");
            q.dequeue();
        }

    }

}