 package Inheritance;

class car {
    
    int cost=800000;
    void cars() { 
        
        System.out.println("The cost of car is " + cost);
    }
}

class Audi extends car {
    int acost=cost/2;
    int speed=150;
    void audi(){
        System.out.println("The cost of audi is "+acost);
        System.out.println("the speed of audi is "+speed);

    }
}
class Model extends Audi{
    int model=2024;
    int topspeed=240;
    void q3(){
        System.out.println("The model is "+model);
        System.out.println("the top speed "+topspeed);
    }
}

public class multilevel {
    public static void main(String[] args) {
      
       
        Model mod= new Model();
        mod.cars();
        mod.audi();
        mod.q3();
    }
    
}
// class multilevel{
//     public static void main(String[] args) {
//         char a[]=new char[100];
//         for(int i=0;;i++)
//             System.out.println(a[50]);
//     }
// }