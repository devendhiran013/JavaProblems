package Inheritance;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw Rectangle");
    }
}
class Circle extends Shape {
    void draw(){
        System.out.println("Draw Circle");
    }
}
public class Abstracteg {
    public static void main(String[] args) {
        Shape rec=new Rectangle();
        Shape cir=new Circle();
        rec.draw();
        cir.draw();
            
        
    }
}
