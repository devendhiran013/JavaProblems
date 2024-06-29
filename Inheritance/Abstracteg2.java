package Inheritance;

abstract class Bank{
    abstract int ROI();
}
class Sbi extends Bank{
   int ROI() {
       return 100;
    }
}
class HDfc extends Bank{
    int ROI(){
        return 200;
    }
}

public class Abstracteg2 {
    public static void main(String[] args) {
        Bank s=new Sbi();
        Bank h=new HDfc();
        System.out.println(s.ROI());
        System.out.println(h.ROI());
    }
    
}
