package DataStructure.Stack;

import java.util.Scanner;

public class Stackusinglinked {
    Node top;

    class Node {
        int data;
        Node next = null;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Stackusinglinked() {
        top = null;
    }

    public void push(int val) {
        Node newnnode = new Node(val);

        newnnode.next = top;
        top = newnnode;

    }

    public void pop() {
        if (top == null) {
            System.out.println("empyt list");
        } else {
            top = top.next;
        }
    }

    public void peek() {
        if(top==null){
            System.out.print("list is empty");
        }
        else{
            System.out.println(top.data);
        }
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stackusinglinked st = new Stackusinglinked();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            st.push(n);
            n--;
            n = s.nextInt();
        }

        st.display();
        st.pop();
        st.display();
        st.peek();
        s.close();
        
    }

}