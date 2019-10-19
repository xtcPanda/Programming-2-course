/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurrenceofmaxnumbers;

import java.util.Scanner;

/**
 *
 * @author mo3az
 */
public class OccurrenceOfMaxNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //(Occurrence of max numbers) 
        int max = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        int n = -1;
        System.out.print("Enter numbers: ");
        while(n!=0){
            n = sc.nextInt();
            if (n > max){
                max = n;
                count = 0;
                count++;
            }else if(n == max){
                count++;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrences of largest number is " + count);
    }
    
}
