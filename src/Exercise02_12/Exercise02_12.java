/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_12;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble(), a = input.nextDouble();
        double length = (Math.pow(v, 2))/(2*a);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
    
}
