
package classProblems;

class Queue {{
    private int a[];
    private int size;
    private int front, rear;}

    Queue(int s) {
        a = new int[s];
        size = s;
        front = rear = -1;
    }

    int isEmpty() {
        if ((front == -1) && (rear == -1))
            return 1;
        else
            return 0;
    }

    int isFull() {
        if ((front == 0) && (rear == size - 1))
            return 1;
        else
            return 0;
    };

    void Enqueue(int x) {
        if (isFull() == 1) {
            System.out.println("Queue is full");

        } else {
            if (isEmpty() == 1) {
                front = rear = 0;
                a[rear] = x;
            } else {
                rear++;
                a[rear] = x;
            }
        }

    };

    void deque() {
         int x = a[front];
        if (isEmpty() == 1) {
            System.out.println("Quuew 9is empty");
        } else {
           
            if (front == rear) {
                front = rear = -1;

            } else {
                front++;
            }
        }
      return x;
    }
     

}

public static void main(String[] args) {
    Queue q = new Queue(5); 
    q.Enqueue(10); 
    q.Enqueue(20); 
    q.Enqueue(30); 
    q.Enqueue(40); 
    q.Enqueue(50); 
    System.out.println(q.deque()); 
    System.out.println(q.deque()); 
    System.out.println(q.deque()); 
    System.out.println(q.deque()); 
    System.out.println(q.deque()); 
    System.out.println(q.deque()); 
}