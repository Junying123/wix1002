
package lab4;
import java.util.Random;

public class l4q6 {
    public static void main(String[] args) {
        
     int num = new Random().nextInt();   
      int count=0; 
      if(num<0)num= -num;
         int ori = num;
         
      while(num!= 0){
          
          num /=10;
          ++count;
      }
      
      System.out.println("No. of " + ori + " digits: " + count);  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
