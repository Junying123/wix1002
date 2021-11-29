
package lab4;
import java.util.Random;
import java.util.Scanner;

public class l4q5 {
    public static void main(String[] args) {
    
    Random rnd = new Random();
        try (Scanner input = new Scanner(System.in)) {
            int player1Score=0;
            int player2Score=0;
            int roll;
            boolean proceed;
            
            do{
                System.out.println("!!!Player 1's Turn!!!");
                proceed=true;
                do{
                    roll= rnd.nextInt(6)+1;
                    System.out.println("Player 1: " + roll);
                    
                    if(roll==6){
                        player1Score += roll;
                        System.out.println("Player 1: " + player1Score
                        + " | Player 2: " + player2Score + "\n");
                        
                    }
                    else{
                        System.out.println("Player 1: " + player1Score
                        + " | Player 2: " + player2Score + "\n");
                        break;
                    }
                    if(player1Score>=100){
                        proceed = false;
                    }
                    else{
                        System.out.print("Enter roll (r) or hold (h):");
                        String response = input.next();
                        if (response.equalsIgnoreCase("h"))
                        {
                            proceed = false;
                        }
                    }
                    
                }while(proceed);
                //turn for p2 to roll
                if(player1Score<100){
                    
                    System.out.println("!!!Player 2's Turn!!!");
                    
                    proceed = true;
                    
                    do{
                        roll= rnd.nextInt(6)+1;
                        System.out.println("Player 2: " + roll);
                        
                        if(roll==6){
                            player2Score += roll;
                            System.out.println("Player 1: " + player1Score
                            + " | Player 2: " + player2Score + "\n");
                            
                        }
                        else{
                            
                            System.out.println("Player 1: " + player1Score
                            +  " | Player 2: " + player2Score + "\n");
                            proceed = false;
                            
                        }
                        
                        if(player2Score>=100){
                            proceed = false;
                        }
                        else{
                            System.out.print("Enter roll (r) or hold (h):");
                            String response = input.next();
                            if (response.equalsIgnoreCase("h"))
                            {
                                proceed = false;
                            }
                        }
                    }while(proceed);
                }
                
            }while(player1Score<100 && player2Score<100);
            
            if(player1Score>=100)
                System.out.println("Player 1 win!!!");
            else
                System.out.println("Player 2 win!!!");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
