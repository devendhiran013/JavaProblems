class Student{
        int reg;
        String name;
        static String clg="Kec";//static variable
        Student(int r,String n){
            reg=r;
            name=n;
        }
        static void change(){ //static method
            clg="Nec";
        }
        void display(){
            System.out.println("Rollno: "+reg+" name: "+name+" College "+clg);
        }
    }
    public class Static {
    public static void main(String[] args) {
        Student.change();
        Student s3=new Student(1, "dev");
        Student s2=new Student(2, "Hii");
        s3.display();
        s2.display();
    }
}
