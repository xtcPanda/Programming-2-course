/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reverse List
        Scanner sc = new Scanner (System.in);
        int[] a = new int [4];
        for(int i = 0; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        reverse(a);
        for(int i = 0; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        
    }
    
    public static void reverse(int[] a){
        int t, stop;
        if(a.length % 2 == 0){
            stop = a.length / 2 - 1;
        }else{
            stop = (a.length + 1) / 2 - 1;
        }
        for(int i = 0, l = a.length - 1; i <= stop && l > stop; i++, l--){
            t = a[i];
            a[i] = a[l];
            a[l] = t;
        }
    }
    
}
