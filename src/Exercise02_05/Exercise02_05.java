/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_05;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble(), rate = input.nextDouble();
        double gratuity = rate/10.0;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    
    }
    
}
