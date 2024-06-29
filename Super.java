class A{
    A(){
        System.out.println("hello");
    }
}
class B extends A{
    B(){
        
        System.out.println("worlf");

    }
}
class C extends B{
    C(){
        
        System.out.println("Welcom");
    }

}

public class Super {
    public static void main(String[] args) {
        C c=new C();
        System.out.println("hii");
    }
    
}
