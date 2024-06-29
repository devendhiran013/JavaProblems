package Polymorphism;

class Bike{
    
    void run(){
        System.out.println("Hero");
    }
    void run(double year){
        System.out.println("model of yera "+year);
    }
}
class RE extends Bike{
    
    void run(int a){
        System.out.println("royal Enfiled"+a);
    }
}
public class Overloding {
    public static void main(String[] args) {
        RE re=new RE();
        re.run(10);
        re.run();
        re.run(20.0);
    }
    
}
