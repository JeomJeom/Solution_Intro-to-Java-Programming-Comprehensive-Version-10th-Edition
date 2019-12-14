/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_13;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double amt = input.nextDouble();
        final double INPUT_AMT = amt;
        
        // Use for loop
        for (int i =0; i < 5; i++){
            amt = (INPUT_AMT + amt) * (1 + 0.00417);
        }
            
        System.out.println("After the sixth month, the account value is $" + amt);
    }
    
}
