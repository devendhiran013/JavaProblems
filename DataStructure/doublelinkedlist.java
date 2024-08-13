package DataStructure;

import java.util.Scanner;

public class doublelinkedlist {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    doublelinkedlist() {
        head = null;
        tail = null;
    }

    public void insertfirst(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {

            newnode.next = head;

            head.prev = newnode;
            head = newnode;
        }
    }

    public void insertlast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {

            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;

        }
    }

    public void insertmid(int pos, int val) {

        Node newnode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next = newnode;
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            tail.next = null;

        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.println(temp.data + " ");
            }

            else {
                System.out.print(temp.data + "<-->");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        doublelinkedlist dll = new doublelinkedlist();
        int k = s.nextInt();
        int n = s.nextInt();
        while (n > 0) {
            if (k == 1) {
                dll.insertfirst(n);
                n = s.nextInt();
            } else if (k == 2) {
                dll.insertlast(n);
                n = s.nextInt();
            }
        }
        dll.display();
        int pos = s.nextInt();
        int mide = s.nextInt();
        dll.insertmid(pos, mide);
        dll.display();
        dll.deletefirst();
        dll.display();
        dll.deletelast();
        dll.display();
        s.close();
    }

}
