
package lab4;
import java.util.Scanner;

public class l4q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int score = 0 ;
        double sum = 0;
        int min=Integer.MAX_VALUE, max=0;
        int numOfScore=5;
        double sumOfSquare=0, average;
        double deviation,mean,variance; 
        
        //loop for enter the score
        for(int a=1; a<=6; a++){
          
            while(score>=0){
            
            System.out.print("Enter a score [negative score to quit]: ");        
                     
            score = sc.nextInt();
            if (score<0){
                break;
            }
            sum+=score;
            sumOfSquare+=Math.pow(score, 2);
            
            if (score < min){
              min = score;        
            }    
            if (score > max){
              max = score;  
            }       
            
            
            }
            
                
            
        }
        
        
        
        
        
        
        
        // Mean and deviation
        average = sum/numOfScore; 
        mean = sumOfSquare-(Math.pow(sum,2)/numOfScore);
        deviation = Math.sqrt((mean)/(numOfScore-1));
        variance = (mean)/(numOfScore-1);
        
        System.out.println(variance);
        System.out.println("Maximum Score: " + max );
        System.out.println("Minimum Score: " + min );
        System.out.println("Average Score: " + average);    
        System.out.printf("Standard Deviation: %.2f\n", deviation);      
                  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
