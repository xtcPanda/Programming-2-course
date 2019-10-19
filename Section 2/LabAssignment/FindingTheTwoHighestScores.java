
package findingthetwohighestscores;

import java.util.Scanner;

/**
 *
 * @author mo3az
 */
public class FindingTheTwoHighestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Finding the two highest scores
        int s;
        String HSN = "", HSN2 = "", SN;
        float HSS = -1, HSS2 = -1, SS;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of The Students: ");
        s = sc.nextInt();
        for(int i = 0; i < s ;i++){
            System.out.print("Enter name for student #" + (i + 1) + ": ");
            SN = sc.next();
            System.out.print("Enter score for student #" + (i + 1) + ": ");
            SS = sc.nextFloat();
            
            if(SS > HSS){
                HSN = SN;
                HSS = SS;
            }else if(SS > HSS2){
                HSN2 = SN;
                HSS2 = SS;
            }
        }
        
        
        System.out.println("the student with the highest score: " + HSN + "    " + HSS);
        System.out.println("the student with the 2nd highest score: " + HSN2 + "    " + HSS2);

        
        
    }
    
}
