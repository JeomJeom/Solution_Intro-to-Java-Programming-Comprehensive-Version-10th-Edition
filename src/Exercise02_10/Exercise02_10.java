/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_10;

import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();
        System.out.print("Enter the temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        double energy = water * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
    
}
