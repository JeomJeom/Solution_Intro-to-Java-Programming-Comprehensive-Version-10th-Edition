/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_04;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();
        System.out.println(pound + " pounds is " + pound*0.454 + " kilograms");
    }
    
}
