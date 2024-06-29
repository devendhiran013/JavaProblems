package Polymorphism;

class Bike{
    void run(){
        System.out.println("Hero");
    }
}
class RE extends Bike{
    void run(){
        System.out.println("royal Enfiled");
    }
}
//run time polymorphism 
public class Methodoveriding {
public static void main(String[] args) {
    RE re=new RE();
    re.run();
}
    
}