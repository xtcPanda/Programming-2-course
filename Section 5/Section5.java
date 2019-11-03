/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Section5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Expand List
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int length = sc.nextInt();
        System.out.print("Start Entering your elements: ");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the expand number:");
        int n = sc.nextInt();
        int[] b = expand(arr, n);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    public static int[] expand(int[] a, int n) {
        if (n <= 0) {
            a = null;
            return a;
        } else if (n == 1) {
            return a;
        } else {
            int[] b = new int[a.length * n];
            for (int k = 0, i = 0; k < a.length; k++) {
                for (int count = 1; i < b.length; i++) {
                    if (count <= n) {
                        b[i] = a[k] / n;
                        count++;
                    } else {
                        break;
                    }
                }
            }
            return b;
        }
    }

}
