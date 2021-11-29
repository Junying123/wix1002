
package lab4;
import java.util.Random;

public class l4q8 {
   
    public static void main(String[] args) {
        
       Random rnd = new Random(); 
        
       
       int i,num,count=0; 
       num = rnd.nextInt(101);
           
       System.out.print("First " + num +" prime numbers are: ");
            
       
        for(int j=1; count<num; j++)
        {
            for(i=2; j%i!= 0; i++);

            if(i == j)
            {
                System.out.println(" "+j);
                count++;
            }
        } 
      
     
        
        
        
        
        
        
        
    }
    
}
