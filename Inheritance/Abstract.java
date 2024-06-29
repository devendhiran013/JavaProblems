package Inheritance;
abstract class name{
    abstract void car();
}
class student extends name{
    void car(){
        System.out.println("Student Name");
    }
}

public class Abstract {
    public static void main(String[] args) {
        name n=new student();
        n.car();
            
        
    }
    
}
