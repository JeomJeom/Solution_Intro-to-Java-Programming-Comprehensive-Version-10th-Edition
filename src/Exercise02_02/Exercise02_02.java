/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_02;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the redius and length of a cylinder: ");
        double radius = input.nextDouble() , length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The area is " + volume);
    }
    
}
