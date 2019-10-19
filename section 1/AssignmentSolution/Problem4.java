
package problem4;

import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class Problem4 {

   
    public static void main(String[] args) {
        // Pythagorean theorem
        
        Scanner sc = new Scanner (System.in);
        System.out.println("a = m^2 - n^2 /nb = 2 * m * n /nc = sqrt(a^2 + b^2)");
        System.out.print("Enter m >");
        double m = sc.nextDouble();
        System.out.println();
        System.out.print("Enter n >");
        double n = sc.nextDouble();
        System.out.println();
        System.out.println("a = m^2 - n^2 = " + (Math.pow(m, 2) - Math.pow(n, 2)));
        System.out.println("b = 2 * m * n = " + (2 * m * n));
        System.out.println("c = sqrt(a^2 + b^2) = " + Math.sqrt(Math.pow(m, 2) + Math.pow(n, 2)));
    }
    
}
