/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_01;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius +32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fehrenheit");
    }
    
}
