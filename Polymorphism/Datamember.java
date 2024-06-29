package Polymorphism;

class math {
    int speedlimit = 90;  
}

class rect extends math {
    int speedlimit = 150; 
}

class Datamember{
    public static void main(String args[]) {
        math obj = new rect(); 
        System.out.println(obj.speedlimit); 
    }
}
