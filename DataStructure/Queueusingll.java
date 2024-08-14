package DataStructure;

import java.util.Scanner;

public class Queueusingll {
    Node front;
    Node rear;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }

    }
    Queueusingll(){
        front=null;
        rear=null;
    }
    public void enqueue(int val){
        Node newNode=new Node(val);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("empty queue");}
        else{
            front=front.next;
        }
    }
    public void peek(){
        if(front==null){
            System.out.println("empty queue");}
        else{
            System.out.println("Peek element is: "+front.data);
        }
    }
    public void display() {
        Node temp = front;
        if (temp == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Queueusingll q = new Queueusingll();

        while(n>0){
            q.enqueue(n);
            n--;
            n=s.nextInt();
        }
        q.display();
        q.peek();


        
        s.close();
    }
}
