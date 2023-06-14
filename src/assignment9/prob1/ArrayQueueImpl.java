package assignment9.prob1;

public class ArrayQueueImpl {
    private int[] arr = new int[3];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (!isEmpty())
            return arr[front];
        else return -1;
    }

    public void enqueue(int obj) {
        if (rear >= arr.length) {
            /*System.out.println("Queue is Full");
            return;*/
            resize();
        }
        if (front == -1) front++;
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        if (front == -1 || front >= arr.length - 1) {
            System.out.println("Array is Empty");
            front = -1;
            return -1;
        }
        arr[front++] = 0;
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (front != -1)
            return rear - front;
        else return 0;
    }

    private void resize() {
        System.out.println("Resize Array");
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, front, newArr, front, rear - front);
        arr = newArr;
    }

    public void display() {
        if (front != -1) {
            for (int e : arr) {
                if (e != 0) System.out.print(e + " ");
            }
            System.out.println();
            System.out.println("[Front: " + arr[front] + " Rear: " + arr[rear - 1] + " Size: " + size() + "]");
        }
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        System.out.println(q.size());
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        System.out.println(q.size());
        q.dequeue();
        q.dequeue();
        q.display();
        System.out.println("Peak:" + q.peek());
    }
}
