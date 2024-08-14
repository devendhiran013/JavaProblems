package DataStructure;

import java.util.Scanner;

class Queue {
    int max;
    int arr[];
    int front, rear;

    Queue(int size) {
        max = size;
        arr = new int[max];
        front = -1;
        rear = -1;
    }

    public void enqueue(int val) {
        if (rear == max - 1) {
            throw new IndexOutOfBoundsException();

        }

        if (front == -1) {
            front++;
        }
        arr[++rear] = val;
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            throw new IndexOutOfBoundsException("Queue is empty");

        }
        return arr[front++];
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Queueusingarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        Queue qu = new Queue(size);

        for (int i = 0; i < size; i++) {
            int n = s.nextInt();
            qu.enqueue(n);
        }

        qu.display();

        qu.dequeue();
        qu.display();

        s.close();
    }
}