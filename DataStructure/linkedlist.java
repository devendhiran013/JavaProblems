package DataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    linkedlist() {
        head = null;
    }

    public void insertFrist(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;

        }
    }

    public void insertlast(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            return;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void insertmid(int pos,int val) {
        Node newnode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        int k = s.nextInt();
        int n = s.nextInt();

        while (n > 0) {

            if (k == 1) {
                ll.insertFrist(n);
                n = s.nextInt();
            } else if (k == 2) {
                ll.insertlast(n);
                n = s.nextInt();
            }

        }
        System.out.print("before");
        ll.display();
        int pos = s.nextInt();
        int midele = s.nextInt();
        ll.insertmid(pos,midele);
        ll.display();

    }
}