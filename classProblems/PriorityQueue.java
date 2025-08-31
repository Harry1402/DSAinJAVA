import java.io.*;

class PriorityQueue
{
    int a[];
    int front , rear , size;


    PriorityQueue(int s)
    {
        a = new int[s];
        front = -1;
        rear = -1;
        size = s;
    }

    int isFull()
    {
        if(rear == size -1)
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


    void insert(int value)
    {
        if(front == -1 && rear == -1)
        {
            front++;
            rear++;
            a[rear] = value;    // 9555031137
        } 
        else
        {   
            int i;
            if(isFull() == 0)
            {
                for(i = rear ; i >= 0 ; i--)
                {
                    if(a[i] < value)
                    {
                        a[i+1] = a[i];
                    }
                    else
                    {
                        break;
                    }
                }

                i++;
                a[i] = value;
                rear++;
            }
            else
            {
                System.out.println("Queue is Full");
                return;
            }
        }

    }

    void deque()
    {
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }else if(isEmpty() != 1)
        {
            System.out.println(a[front] + " Deleted");
            front++;
        }
        
    }

    int getFront()
    {
        if(isEmpty() != 1  && front != -1)
        {
            return a[front];
        }
        else
        {
            System.out.println("Queue is Empty");
            return -1;
        }
    }


    public static void main(String[] args) {
        
        PriorityQueue q = new PriorityQueue(10);

        q.insert(5);
        q.insert(8);
        q.insert(4);
        q.insert(10);
        q.insert(2);

        while(q.isEmpty() != 1)
        {
            System.out.println(q.getFront());
            q.deque();
        }

    }
}