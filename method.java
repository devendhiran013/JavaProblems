
class Add {
    Add(int a){
        System.out.println(a);
    }
    Add(int a,int b){
        System.out.println(a+b);

    }
    Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    
}
class method{
    public static void main(String[] args) {
        Add ob=new Add(10);
        Add ob1=new Add(10,20);
        Add ob2=new Add(10,20,30);

    }
}
