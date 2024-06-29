package Polymorphism;

class Bank {
    double roi() {
        return 0;
    }
}

class Sbi extends Bank {
    double roi() {
        return 8.9;
    }
}

class Axis extends Bank {
    double roi() {
        return 7.3;
    }
}

class KVB extends Bank {
    double roi() {
        return 9.7;
    }
}

public class BankScene {
    public static void main(String[] args) {
        Bank b;
        b = new KVB();
        System.out.println(b.roi() + "%");
        b = new Axis();
        System.out.println(b.roi() + "%");
        b = new Sbi();
       
        
        System.out.println(b.roi() + "%");
    }
}
