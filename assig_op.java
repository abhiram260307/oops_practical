package CSE;
import java.util.Scanner;
public class assig_op {
 public static void main(String[] args) {
   int a;
     
     Scanner sc= new Scanner(System.in);
       a=sc.nextInt();
       
     int var;

     
     var = a;
     System.out.println("var using =: " + var);

     
     var += a;
     System.out.println("var using +=: " + var);

     
     var *= a;
     System.out.println("var using *=: " + var);
   }
 }