/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise01_11;

/**
 *
 * @author lina
 */
public class Exercise01_11 {
    public static void main(String[] args) {
        int current = 312032486;
        for (int i=1; i < 6; i++){
            current = current + 365 * ((60*60*24)/7 - ((60*60*24)/ 13) + ((60*60*24)/45));
            System.out.println("Year" + i + ": " + current);
        }
    }
    
}
