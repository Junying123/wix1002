/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labreport1q3;
import java.util.Scanner;
/**
 *
 * @author garet
 */
public class labrepo1q3 {public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter quadratic equation in ax2+bx+c : "); 
       String quadratic = sc.nextLine();
       int a ;
       int b ;
       int c ;
       
       
       if(quadratic.charAt(0) == 'x' ){
        a = 1;
         if (quadratic.charAt(3) == 'x')
        b = 1;
         else {
             b = Character.getNumericValue(quadratic.charAt(3));
         }
       }
       else {
           a = Character.getNumericValue(quadratic.charAt(0));
           if(quadratic.charAt(4) == 'x')
               b = 1;
           else 
               b = Character.getNumericValue(quadratic.charAt(4));
       }
       c = Character.getNumericValue(quadratic.charAt(quadratic.length()-1));

            System.out.println(a + " " + b + " " + c);





     }


}