/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02_07;

import java.util.Scanner;

/**
 *
 * @author lina
 */
public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number of minutes: ");
        int minute = input.nextInt();
        double year = (double)minute/(60*24*365);
        double day = (year - (int)year)* 365;
        System.out.println(minute + " minutes is approximately " + (int)year + " years and " + (int)day+ " days");
    }
    
}
