package Inheritance;
//single +multilevel=hybrid
class GF{
    void gf(int age){
        System.out.println("GF age "+age);
    }
}
class F extends GF{
    void f(int age){
        System.out.println("father age "+age);
    }
}
class Son1 extends F{
    void son1(int age){
        System.out.println("Son1 age "+age);
    }
}
class Son2 extends F{
    void son2(int age){
        System.out.println("Son2 age "+age);
    }
}
class Son3 extends F{
    void son3(int age){
        System.out.println("Son3 age "+age);
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Son1 s1=new Son1();
        s1.son1(30);
        
        Son2 s2=new Son2();
       
        s2.son2(40);
        
        Son3 s3=new Son3();
        
       
        s3.son3(50);
        
        s3.f(70);
        s3.gf(100);

    }
    
}
