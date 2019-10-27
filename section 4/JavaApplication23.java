/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // household income
        Scanner sc = new Scanner (System.in);
        double income;
        int child;
        while(true){
            System.out.print("Enter the household income: ");
            income = sc.nextDouble();
            if(income == -1){
                break;
            }
            System.out.print("Enter the # of kids: ");
            child = sc.nextInt();
            if(child == -1){
                break;
            }
            if(amount(income,child) != -1){
            System.out.println("The amount is "+amount(income,child));
            }
        }
    }
    
    public static int amount(double i, int k){
        int amount;
        if(i >= 30000 && i <= 40000 && k >= 3){
            amount = k * 1000;
        }else if(i >= 20000 && i < 30000 && k >= 2){
            amount = k * 1500;
        }else if(i < 20000){
            amount = k * 2000;
        }else{
            amount = -1;
        }
        return amount;
    }
    }
    
}
