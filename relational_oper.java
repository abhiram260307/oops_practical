package CSE;
import java.util.Scanner;
public class relational_oper {
 public static void main(String[] args) {
     int a = 7, b = 11;
     Scanner sc= new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
     System.out.println("a is " + a + " and b is " + b);
        System.out.println(a == b);  
        System.out.println(a != b);  
        System.out.println(a > b);  
        System.out.println(a < b);  
        System.out.println(a >= b);  
        System.out.println(a <= b);  
   }
 }