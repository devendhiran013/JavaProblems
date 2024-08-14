package DataStructure.Stack;

import java.util.Scanner;

class stacks {
    int arr[];
    int top;
    int capacity;

    stacks(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            throw new StackOverflowError();
        }
        arr[++top] = val;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            // System.out.println(arr[top--]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {

            System.out.println(arr[top]);
        }
    }

    public void display() {
        int temp = top;
        while (temp != -1) {
            System.out.print(arr[temp] + " ");
            temp--;
        }
    }
}

class Stackusingarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        stacks st = new stacks(size);
        for (int i = 0; i < size; i++) {
            int val = s.nextInt();
            st.push(val);

        }
        st.display();
        System.out.println();
        st.pop();
        st.display();
        System.out.println();
        st.peek();

        s.close();

    }
}