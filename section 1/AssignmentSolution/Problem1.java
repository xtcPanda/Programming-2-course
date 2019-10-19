
package problem1;

import java.util.Scanner;

/*
 * @author moaaz
 */
public class Problem1 {


    public static void main(String[] args) {

        // Swap with a temporary var

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println();
        
        int t = a;
        a = b;
        b = t;
        
        System.out.println("a became " + a + ", b became " + b);
    }
    
}