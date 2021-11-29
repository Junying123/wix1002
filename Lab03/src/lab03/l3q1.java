
package lab03;
import java.util.Scanner;

public class l3q1 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        //Scan the 2 integer
        System.out.print("Enter two integer number: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        //Scan the operator
        System.out.print("Enter the operand: ");
        char c = sc.next().charAt(0);
        /* 
           in.nextline();
           String op = sc.nextline();
           char operand = op.charAt(0);
        */
        //Determine which operator is be used for calculation
        switch (c) {
            case '+':
                int sum = a+b;
                System.out.printf("%d + %d = %d\n",a,b,sum);
                break; 
                    case '-':
                int diff = a-b;
                System.out.printf("%d - %d = %d\n",a,b,diff);
                break;
            case '*':
                int multi = a*b;
                System.out.printf("%d * %d = %d\n",a,b,multi);
                break;
            case '/':
                int divide = a/b;
                System.out.printf("%d / %d = %d\n",a,b,divide);
                break;
            default:
                int remainder= a%b;
                System.out.printf("%d %% %d = %d\n",a,b,remainder);
                break;
        }
        /*
        if( c == '+'){
        int sum = a+b;
        System.out.printf("%d + %d = %d\n",a,b,sum);            
        }else if (c == '-'){
        int diff = a-b;
        System.out.printf("%d - %d = %d\n",a,b,diff);
        }else if (c == '*'){
        int multi = a*b;
        System.out.printf("%d * %d = %d\n",a,b,multi);
        }else if (c == '/'){
        int divide = a/b;
        System.out.printf("%d / %d = %d\n",a,b,divide);
        }else{
        int remainder= a%b;
        System.out.printf("%d %% %d = %d\n",a,b,remainder);
        }
         */


            
    }
    
}
