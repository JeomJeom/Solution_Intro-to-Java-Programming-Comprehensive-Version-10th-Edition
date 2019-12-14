/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_09;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble(), v1 = input.nextDouble(), t = input.nextDouble();
        double average = (v1 - v0)/t;
        System.out.println("The average acceleration is " + average);
    }
    
}
