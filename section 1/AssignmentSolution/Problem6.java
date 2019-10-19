/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

import java.util.Scanner;

/**
 *
 * @author mo3az
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the sum of the 3-digits in the 3-digits number
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a 3-digit num: ");
        int n = sc.nextInt(), d, sum = 0;
        if (n < 1000)
        {
            for (int i = 0; i < 3; i++)
            {
                d = n % 10;
                sum += d;
                n /= 10;
            }
            System.out.println("the sum of the digits is " + sum);
        }else
        {
            System.out.println("Entered an invalid number sorry bye.");
        }
    }
    
}
