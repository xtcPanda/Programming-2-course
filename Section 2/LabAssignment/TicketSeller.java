
package ticketseller;

import java.util.Scanner;

/**
 *
 * @author mo3az
 */
public class TicketSeller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  TicketSeller
        int n, T = 100;
        boolean limit = false;
        Scanner sc = new Scanner(System.in);
        while(T > 0){
            System.out.print("How many ticket do you need ?");
            n = sc.nextInt();
            System.out.println();
            if ( n > 4 ){
                System.out.println("You only can buy 4 maximum.");
                limit = true;
                n = 0;
            }else{
                if(T < 4){
                    System.out.println("You ONLY have " + T + " left.");
                }else{
                    T -= n;
                    System.out.println("You have " + T + " left.");
                }
            }
            
        }
        
        
    }
    
}
