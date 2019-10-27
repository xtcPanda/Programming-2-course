/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // change ur password
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your old passwprd: ");
        String Old = sc.nextLine();
        System.out.println();
        
        System.out.print("Enter your new passwprd: ");
        String New = sc.nextLine();
        System.out.println();
        
        System.out.println(validatePassword(Old,New));
    }
    
    public static String validatePassword(String oldPassword, String newPassword){
        int count = 0;
        boolean isU = false;
        boolean isL = false;
        if (!(oldPassword.length() < 8)){
            if(!(newPassword.contains(oldPassword))){
                for(int i = 0; i < newPassword.length() ; i++){
                    if(Character.isDigit(newPassword.charAt(i))){
                        count++;
                    }
                    if(Character.isUpperCase(newPassword.charAt(i))){
                        isU = true;
                    }
                    if(Character.isLowerCase(newPassword.charAt(i))){
                        isL = true;
                    }
                }
            }
            if(isU && isL && count > 0){
                return "Succeful Change !";
            }
        }
        
        return "The password must be at least 8 characters long.\n"
                + "The old password must not a part of the new password.\n"
                + "The password must contain at least 1 digit.\n"
                + "The password must have at least one uppercase and one lowercase letter.";
    }
}
