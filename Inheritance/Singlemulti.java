package Inheritance;
class GF{
    void gf(){
        System.out.println("GF");
    }
}
class F extends GF{
    void f(){
        System.out.println("father");
    }
}
class Son1 extends F{
    void son1(){
        System.out.println("Son");
    }
}
class Son2 extends Son1{
    void son2(){
        System.out.println("Son2");
    }
}
class Son3 extends Son2{
    void son3(){
        System.out.println("Son3");
    }
}
public class Singlemulti {
    public static void main(String[] args) {
        // Son1 s1=new Son1();
        // Son2 s2=new Son2();
        Son3 s3=new Son3();
        // F fa=new F();
        s3.son1();
        s3.son2();
        s3.son3();
        s3.f();
        s3.gf();

    }
}
