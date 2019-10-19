
package problem2;

import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class Problem2 {

    
    
    
    public static void main(String[] args) {
        // calculating the BMI w with kg , h with meter
        Scanner sc = new Scanner (System.in);
        System.out.print("Type in your weight: ");
        double w = sc.nextDouble();
        System.out.println();
        System.out.print("Type in your Height: ");
        double h = sc.nextDouble();
        System.out.println();
        
        double BMI = w / Math.pow((h/100),2);
        System.out.println("your BMI = " + BMI);
    }
    
}