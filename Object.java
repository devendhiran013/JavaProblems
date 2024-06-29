import java.util.Scanner;

class People{
    String N,Ad;
    int Ag;
    People(String name,String adddr,int age){
        N=name;
        Ad=adddr;
        Ag=age;

    }
    
}
class Object{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            
            String n1=s.nextLine();
            String ad1=s.nextLine();
            int ag1=s.nextInt();
            s.nextLine();
            String n2=s.nextLine();
            String ad2=s.nextLine();
            int ag2=s.nextInt();
            People obj= new  People(n1,ad1,ag1);
            People obj1= new  People(n2,ad2,ag2);
            System.out.println("Name"+obj.N);
            System.out.println("Addrees"+obj.Ad);
            System.out.println("Age"+obj.Ag);
            System.out.println("Name"+obj1.N);
            System.out.println("Addrees"+obj1.Ad);
            System.out.println("Age"+obj1.Ag);


            
        }
    }

