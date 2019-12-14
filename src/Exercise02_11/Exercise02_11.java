/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_11;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of years: ");
        int number = input.nextInt();
        double current = 312032486;
        for (int i=1; i < number+1; i++){
            current = current + 365 * ((60*60*24)/7.0 - ((60*60*24)/ 13.0) + ((60*60*24)/45.0));
        }
        System.out.println("The population in 5 years is " + (int)current);
    }
    
}
