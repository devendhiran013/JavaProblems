package Inheritance;


class father{
   
    void dad(int age){
       System.out.println("age is"+age); 

    }
}
class son extends father{
    void son(int age1){
        System.out.println("son age"+age1);
    }
}
public class Single {
    public static void main(String[] args) {

        son s=new son();
       
        s.son(20);
        s.dad(50);
        
    }
}
