
package lab03;
import java.util.Random;

public class l3q2 {
    public static void main(String[] args) {
      Random rand = new Random();  
        
      int num = rand.nextInt(6);
        
        switch (num) {
            case 0 -> System.out.printf("%d is zero.\n",num);
            case 1 -> System.out.printf("%d is one.\n",num);
            case 2 -> System.out.printf("%d is two.\n",num);
            case 3 -> System.out.printf("%d is three.\n",num);
            case 4 -> System.out.printf("%d is four.\n",num);
            default -> System.out.printf("%d is five.\n",num);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
