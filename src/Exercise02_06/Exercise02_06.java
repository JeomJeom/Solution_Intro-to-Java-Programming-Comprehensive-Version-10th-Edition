/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_06;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int first = number/100;
        int second = number/10 - first * 10;
        int third = number%10;
        int sum = first + second + third;
        System.out.println("The sum of the digits is " + sum);
    }
    
}
