interface circumference{
  int cir(int a,int b);
   
}
interface circumferences{
    float circ(int r);
     
  }

public class lamda {
    public static void main(String[] args) {
        circumference obj=(a,b)->{
            return 2*a+2*b;
        };
        System.out.println("Rectangle: "+obj.cir(1,2));
        circumference obj1=(a,b)-> (a*b)/2;
        System.out.println("Triangle: "+obj1.cir(10, 3));

        circumferences obj2=(r)->{return (float)(r*r*3.14);};
        System.out.printf("Circle: %.2f",obj2.circ(5));
       
    }
}
