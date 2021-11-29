
package lab03;
import java.util.Scanner;

public class l3q3 {
     public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        //Scan the sales volume  
        System.out.print("Enter the sales volume: RM ");
           int salesVol = sc.nextInt();
          
          
        //Calculate the commission that have earned from sales volume  
        if(salesVol <= 100){
           
           double comm = salesVol*0.05;
           System.out.printf("The commision is RM%.2f\n",comm);    
        
        }else if(salesVol >= 100 && salesVol <= 500) {            
           
           double comm = salesVol*0.75;   
           System.out.printf("The commision is RM%.2f\n",comm);   
        
        }else if(salesVol >= 500 && salesVol <= 1000) {      
           
           double comm = salesVol*0.10;   
           System.out.printf("The commision is RM%.2f\n",comm);   
        
        }else {
            
           double comm = salesVol*0.125;   
           System.out.printf("The commision is RM%.2f\n",comm);
        
        }      
              
              
              
                  
    }
}
