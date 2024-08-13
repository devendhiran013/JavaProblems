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
        tail=null;
    }
    public void insertlast(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            Node temp=head;
            while(temp!=null){
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
                
            }
        }
    }
    public void deletelast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
          Node temp=head;
          while(temp.next!=null){
            temp=temp.next;
          }
          temp.next=null;

        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            if(temp.next==null){
                  System.out.println(temp.data+" ");
            }
             
            else {
                System.out.print(temp.data + "<-->");
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        doublelinkedlist dll = new doublelinkedlist();
        int n=s.nextInt();
        while(n>0){
        dll.insertlast(n);
        n=s.nextInt();}
        dll.display();
        dll.deletelast();
        dll.display();
        s.close();
    }

}
