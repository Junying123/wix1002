
package lab03;
import java.util.Scanner;

public class l3q6 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
    //Prompt user to enter the radius and point
        System.out.print("Enter the radius in cm: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter a coordinate point: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        // Calculate the distance with the certain coordinate
        double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        
        //Check whether the point within the circle
        if(distance <= radius){
        
    System.out.println("Point( " + x + "," + y + " ) is in the circle.");
        
        }else{
        
    System.out.println("Point( " + x + "," + y + " ) is not in the circle.");    
        
        }        
            
        
        
        
        
        
      
        
    }
   
}
