
package labreport1q3;
import java.util.Scanner;

public class testlabrepo {public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter quadratic equation in ax2+bx+c : "); 
       
       String quadratic = sc.nextLine();
       int a; int c;
       int b = 0;
       
       if(quadratic.charAt(0)== 'x'){
               a = 1;
          
          if(quadratic.charAt(3)== 'x')
               b = 1;
          
          else {
               b = Character.getNumericValue(quadratic.charAt(3));
        }
       }          
                       
       else {
               a = Character.getNumericValue(quadratic.charAt(0));
            
          if(quadratic.charAt(3)== '-' || quadratic.charAt(4)== 'x')
               b = -Character.getNumericValue(quadratic.charAt(4));
       }
       
       if(quadratic.charAt(quadratic.length()-2) == '-'){
               c = -(Character.getNumericValue(quadratic.charAt(quadratic.length()-1)));
       }
        else{
               c = Character.getNumericValue(quadratic.charAt(quadratic.length()-1));
       }

       
       
       //check the discriminant & calculate discriminant 
       double discrim = b*b-(4*a*c); 
            
       //find roots and display it
       if (discrim > 0){
           //there are 2 different roots   
           double x1 = (-b+Math.sqrt(discrim))/(2*a);
           double x2 = (-b-Math.sqrt(discrim))/(2*a);
           System.out.println("This quadratic equation has 2 root(s).");
           System.out.printf("x = %.1f\nx = %.2f\n", x1, x2 );
       } 
       else if(discrim == 0){         
           //there are 2 equal roots 
           System.out.println("This quadratic equation has 1 root(s).");
           int x = (-b +(int)Math.sqrt(discrim))/(2*a);
           System.out.println("x = " + x);
       }
       else if (discrim < 0){    
           //there are no roots where discriminant is negative
           System.out.println("This quadratic equation has 0 root(s).");
           System.out.println("No Solution"); 
       }    
           
        
       
       
       
       
       
       
       
       
       
     }


}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
 
  























