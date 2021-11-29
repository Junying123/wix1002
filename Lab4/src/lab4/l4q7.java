
package lab4;
import java.util.Scanner;

public class l4q7 {
    public static void main(String[] args) {
       
       //formula 1 
       double M;//monthly payment
       double P;//principal
       double i;//yearly interest
       double N;//total no. of months
        
       //formula 2 
       double C;//principal portion due
       double n;//month under consideration
       double L;//interest due
       double R;//remaining principal balance due
       double totalInterest=0;
       
       Scanner sc = new Scanner(System.in);  
        
       System.out.print("Enter principal amount: ");
        P = sc.nextDouble(); 
       
       System.out.print("Enter interest in %: ");
        i = sc.nextDouble(); 
        
       System.out.print("Enter the total number of month(a): ");
        N = sc.nextDouble(); 
        
        //calculate monthly payment
        M = (P*(i/(12*100)))/(1-Math.pow(1+(i/1200), -N)); 
        
        
        System.out.printf("%-8s %18s %18s %18s %18s %18s ", "Month",
                "Monthly Payment","Principal","Interest","Unpaid Balance"
                ,"Total Interest"); 
        System.out.println("");
        
        //total interest by accumulating the interest per month
        for(int month=1; month<= N; month++){
            n = month;
            C = M*Math.pow(1+(i/1200),-(1+N-n));
            L = M-C;
            R = L/(i/1200)-C;
            totalInterest+=L;
            
            System.out.printf("%-8d %18.2f %18.2f %18.2f %18.2f %18.2f \n"
                              ,month,M,C,L,R,totalInterest);
        } 
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
