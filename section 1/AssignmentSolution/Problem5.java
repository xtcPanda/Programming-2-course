// cant i change main to int in java ? it says ur missing ur main if i do !


package problem5;

import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class Problem5 {

   
    public static void main(String[] args) {
        // feeding the dogs
        // 100 bone, 3 dogs : Dipsy= 2 Laa-Laa ^ Laa-Laa= 1.5 Po
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter How many Bones Po ate out of 100 >");
        double P = sc.nextDouble();
        System.out.println();
        double L = P * 1.5;
        double D = L * 2;
        if ((P+L+D) <= 100)
        {
            System.out.println("Dipsy ate " + D + ", Laa-Laa ate " + L + " Po ate " + P);
        }else
        {
            System.out.println("Po gone wild and hungry dude !");
        }
    }
    
}

