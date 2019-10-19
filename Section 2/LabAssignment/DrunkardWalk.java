
package drunkardwalk;

import java.util.Random;

/**
 *
 * @author mo3az
 */
public class DrunkardWalk {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Random walker
        // N = +eve y-axis , S = -ve y-axis , E = +eve x-axis , W = -eve x-axis
        int dx = 0, dy = 0;
        System.out.println("Start Location: (" + dx + "," + dy + ")");
        Random rand = new Random();
        for(int i = 0; i < 100 ; i++){
            int direction = rand.nextInt(4);
            switch(direction){
                case 0:
                    //N
                    dy++;
                    break;
                case 1:
                    //S
                    dy--;
                    break;
                case 2:
                    //E
                    dx++;
                    break;
                case 3:
                    //W
                    dx--;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("End Location: (" + dx + "," + dy + ")");
    }
    
}
