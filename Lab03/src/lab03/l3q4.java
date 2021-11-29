package lab03;
import java.util.Random;
import java.util.Scanner;

public class l3q4 {
    public static void main(String[] args) {
        
        //prompt the game to start
        Scanner sc = new Scanner(System.in);
        
        //generate random number for dice
        Random ranNum = new Random();
         
        //for player 1's game
        System.out.print("Player 1 press 1 for rolling dice: ");
        int roll = sc.nextInt();   
        int d1 = ranNum.nextInt(6)+1;
        int d2 = ranNum.nextInt(6)+1;
        int p1 = d1 + d2;
        System.out.printf("Player 1's score: %d\n", p1);  
       
        //for player 2's game
        System.out.print("Player 2 press 2 for rolling dice: ");
        roll = sc.nextInt();
        int d3 = ranNum.nextInt(6)+1;
        int d4 = ranNum.nextInt(6)+1;
        int p2 = d3 + d4;            
        System.out.printf("Player 2's score: %d\n", p2);
        
        //compare each player's score and who will be the winner
        if(p1>=p2){
            System.out.println("Player 1 win!!");
        
        }else if(p1<=p2){
            System.out.println("Player 2 win!!");
        
        }else{ 
            System.out.println("Draw!!");
        }
        
              
    }
}
