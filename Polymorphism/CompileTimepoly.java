package Polymorphism;

public class CompileTimepoly {
    int abc(int l,int b ){
        return l*b;
    }
    int abc(int s){
        return s*s;
    }
    public static void main(String[] args) {
        CompileTimepoly c=new CompileTimepoly();
        System.out.println(c.abc(10,20));
        System.out.println(c.abc(10));
    }
}
