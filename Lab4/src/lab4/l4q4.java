
package lab4;
import java.util.Scanner;

public class l4q4 { 
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        System.out.print("Enter the first day of the year (0 for Sunday, "
                              + "1 for Monday,...): ");
        
        int firstDay = sc.nextInt();  
        int numberOfDaysInMonth=0;
        
        if (year % 4 == 0) {
               if(year%100!=0){
                  numberOfDaysInMonth++;
               }else{if(year%400==0)
                  numberOfDaysInMonth++;                  
               }
        }
        for(int i=1; i<=12; i++){
            
            String month = "";
            //Process the month
            switch(i){
                case 1 -> {
                    month = "Jan";
                    numberOfDaysInMonth=31;
                }
                case 2 -> {
                    month = "Feb";
                    numberOfDaysInMonth=28;
                }
                case 3 -> {
                    month = "March";
                    numberOfDaysInMonth=31;
                }
                case 4 -> {
                    month = "April";
                    numberOfDaysInMonth=30;
                }
                case 5 -> {
                    month = "May";
                    numberOfDaysInMonth=31;
                }
                case 6 -> {
                    month = "June";
                    numberOfDaysInMonth=30;
                }
                case 7 -> {
                    month = "July";
                    numberOfDaysInMonth=31;
                }    
                case 8 -> {
                    month = "August";
                    numberOfDaysInMonth=31;
                }
                case 9 -> {
                    month = "Sept";
                    numberOfDaysInMonth=30;
                }    
                case 10 -> {
                    month = "Oct";
                    numberOfDaysInMonth=31;
                }
                case 11 -> {
                    month = "Nov";
                    numberOfDaysInMonth=30;
                }
                case 12 -> {
                    month = "Dec";
                    numberOfDaysInMonth=31;
                }
                 
            }    
                
       System.out.printf("%33s %6s\n",month, year);
       System.out.println(String.format("%65S", "").replace(' ', '-'));
       System.out.printf("\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "Sun", "Mon",
                "Tue", "Wed", "Thu", "Fri", "Sat");
       System.out.println(String.format("%65S", "").replace(' ', '-'));
        
         
        //Calculating days in month    
         for (int j = 0; j < firstDay; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=numberOfDaysInMonth ; j++)
            {
                if (j < 10) {
                    System.out.print("\t" + j);
                } else {
                    System.out.print("\t" + j);
                }
                if ((j + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("\n");


            firstDay = (firstDay + numberOfDaysInMonth) % 7;   
        
           
            
                
         
        
        
        
        
        
        
        
        
        }    
        
        
    }
    
}
