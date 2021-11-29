
package lab4;
import java.util.Scanner;

public class l4q1 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
         
         System.out.print("Enter an Integer: ");
         int num = s.nextInt();
         System.out.print("The factors are: ");
         
         for(int i = 1; i<= num; i++){
                           
             if(num % i == 0){
                 if(i==num)
                    System.out.println(i);
                 else
                    System.out.print(i+", ");
                     
             }
             
         }    
             
       
             
             
             
             
 }
    
}
