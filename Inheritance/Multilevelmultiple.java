package Inheritance;
class Gf{
    void gf(){
        System.out.println("GF");
    }
}
class F extends Gf{
    void f(){
        System.out.println("F");
    }
}
interface S {
   default void s(){
        System.out.println("Son");
    }
}
interface Gs {
    default void gs(){
        System.out.println("gs");
    }
}
class Gd extends F implements S,Gs{
    void gd(){
        System.out.println("gd");
    }
}
public class Multilevelmultiple {
    public static void main(String[] args) {
        Gd t=new Gd();
        t.gd();
        t.gs();
        t.s();
        t.f();
        t.gf();

    }
}
