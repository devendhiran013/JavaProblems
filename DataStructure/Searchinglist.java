package DataStructure;

import java.util.*;

class Searchinglist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Searchinglist() {
        head = null;
    }

    public void insertlast(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
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
        Searchinglist ll = new Searchinglist();
        int n = s.nextInt();
        int count = 0;
        while (n > 0) {
            ll.insertlast(n);
            n = s.nextInt();
            count++;
        }
        int ch = s.nextInt();
        int k = 0;
        for (int i = 0; i < count; i++) {
            if (ch == ll.head.data) {
                k = 1;
                break;
            }
            else{
                ll.head = ll.head.next;

            }

        }
        if(k==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
        s.close();
    }
}