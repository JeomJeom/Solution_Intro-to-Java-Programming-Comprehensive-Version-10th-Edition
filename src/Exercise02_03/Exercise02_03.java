/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_03;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet is " + feet*0.305 + " meters");
    }
    
}
