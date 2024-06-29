public class string {
    public static void main(String ar[]){
        String s ="SachinTendulkar";
        System.out.println(s.substring(6));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.endsWith("a"));
        System.out.println(s.charAt(1));
        System.out.println(s.length());
        String s1="Wave";
        String s2="Length";
        String s3=s1.concat(s2);
        System.out.println(s1+" "+s2);
        int a=10;
        String str=String.valueOf(a);
        System.out.println(str+10);
        char sh[]={'w','e','l','c','o','m','e'};
        String st=new String(sh);
        System.out.println(st);
       /*String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));*/

    }
    
}
