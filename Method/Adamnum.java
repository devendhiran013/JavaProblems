package Method;
import java.util.Scanner;

public class Adamnum {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sqr_num=square(num);
        int rev_num=reverse(num);
        int sqr_rev_num=square(rev_num);
        int rev_sqr_rev_num=reverse(sqr_rev_num);
        if(sqr_num==rev_sqr_rev_num)
        {
        	System.out.println("adam number");
        }
        else {
        	System.out.println("not a adam number");
        }
	}
	public static int square(int num) {
		return num*num;
	}
	public static int reverse(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
}