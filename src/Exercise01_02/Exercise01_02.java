/*
Qn1.2 (Display five messages) Write a program that displays Welcome to Java five times.
 */
package Exercise01_02;

/**
 *
 * @author lina
 */
public class Exercise01_02 {
    public static void main(String[] args) {
        //method 1: manual way of getting output
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        
        //method 2: advance solution by using for loop
        for(int i = 0; i < 5; i++){
        System.out.println("Welcome to Java");
        }
    }
    
}
