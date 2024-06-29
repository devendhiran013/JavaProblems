package Inheritance;
//Multiple+Hierachial=Hybrid
interface  House {
    void house();
}

interface Father extends House {
    void father();
}

interface Mother extends House {
    void mom();
}

class Son implements Father, Mother {
    void son() {
        System.out.println("I am the son");
    }

    
    public void father() {
        System.out.println("Iam the father of the house");
    }

  
    public void mom() {
        System.out.println("Iam the mother of the house");
    }
    public void house() {
        System.out.println("Iam the  house");
    }
}

public class MultipleHier {
    public static void main(String[] args) {
        Son s1 = new Son();

        s1.house();
        s1.father();
        s1.mom();
        s1.son();
    }
}
