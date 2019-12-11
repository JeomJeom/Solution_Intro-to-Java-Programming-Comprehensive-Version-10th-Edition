/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise01_06;

/**
 *
 * @author lina
 */
public class Exercise01_06 {
    public static void main(String[] args) {
        //Method 1: 
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        
        
        //Method 2:
        int count = 0;
        for (int i=1; i < 10; i++){
            count= count+i;
        }
        System.out.println(count);
        
    }
    
}
