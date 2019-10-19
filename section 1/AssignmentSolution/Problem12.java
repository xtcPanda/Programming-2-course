package problem12;

import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class Problem12 {

    
    
    public static void main(String[] args) {
        // Swap without a temporary var
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println();
        
       a = a + b;
       b = a - b; // b = a! 
       a = a - b; 
// b turned to a so now we r subtracting the new b from the old big a with a + b so a turns to b

/*
* we can do it by multiplication too and it will WORK !
* a = a * b;
* b = a / b;
* a = a / b;
*/
        
        System.out.println("a became " + a + ", b became " + b);
    }
    
}

// how to pass by refrence in java ?!! and where is my pointers ?!
