
package labreport1q3;
import java.util.Scanner;


public class Labreport1q3 {

    
    public static void main(String[] args) {
       
       //Create scanner class object
       Scanner sc = new Scanner(System.in);
       //Display quadratic equation
       System.out.print("Enter quadration equation of ax2 + bx+ c: ");
       
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       if(a==1 && b==1 && c!=1){
        System.out.println("x2+x+"+c);
        }
        else if (a==1 && b!=1 && c==1){
        System.out.println("x2+"+b+"x+1");
        } 
        else if (a>= -1 || b>= -1 || c>= -1) {
        System.out.println(a+"x2"+b+"x"+c);
        }
        else {
        System.out.printf("%dx2+%dx+%d\n",a,b,c);
        }
       
       
              

       //check the discriminant & calculate discriminant 
       double discrim = Math.pow(b,2)-(4*a*c); 
       
       //find roots
       if (discrim<1){
           //there are no roots where discriminant is negative
           System.out.println("This equation has 0 roots");
           System.out.println("No Solution");
       } 
       else if(discrim==0){         
           //there are 2 equal roots 
           double x = (-b+(double)Math.sqrt(discrim))/2*a;
           System.out.println("This equation has 1 roots");
           System.out.println("x =" + x);
       }
       else {    
           //there are 2 different roots   
           double x1 = (-b+(double)Math.sqrt(discrim))/2*a;
           double x2 = (-b-(double)Math.sqrt(discrim))/2*a;
           System.out.println("This equation has 2 roots");
           System.out.printf("x = %f\n x = %f\n", x1, x2 );
       }    
           
        sc.close();
    }
    
}
