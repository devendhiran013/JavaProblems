package Polymorphism;

public class ABC {
    void Nec(int a,int b){
         System.out.println("number is"+a+" "+b);
    }
    void Nec(float c,float e){
        System.out.println("number is"+ c+" "+e);
    }
    public static void main(String[] args) {
        ABC b=new ABC();
        b.Nec(12, 12);
        ABC c=new ABC();
        c.Nec(12,5);
    }
}

