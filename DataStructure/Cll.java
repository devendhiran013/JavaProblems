package DataStructure;

import java.util.Scanner;

public class Cll {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;

        }
    }

    Cll() {
        head = null;
        tail = null;

    }

    public void insertfirst(int val) {
        Node newnode = new Node(val);

        if (head == null) {

            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
            head = newnode;
        }

    }

    public void insertlast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;

        }
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
        }

        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
        }

        else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            
            temp.next = head;


        }
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != head) {
                System.out.print(" -> ");
            }
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();

        Cll cll = new Cll();
        while (n > 0) {
            if (k == 1) {
                cll.insertfirst(n);
                n = s.nextInt();
                k=s.nextInt();
                
               
            } else if (k == 2) {
                cll.insertlast(n);
                n = s.nextInt();
                
            }
            
        }
        cll.display();
        cll.deletefirst();
        cll.display();
        cll.deletelast();
        cll.display();
        s.close();
    }
}
