/*
 * Eratosthenes.java
 * Quentin Magoon
 * Febuary 27, 2019
 * Finds prime numbers between 1-1000
 */

package eratosthenes;


public class Eratosthenes {


    public static void main(String[] args) {
        
        //declaring variables
        int n = 1000;
        int line = 0;
        boolean numbers[] = new boolean[1001]; 
        
        //sets all numbers to true
        for (int i = 0; i < n; i++) {
            numbers[i] = true;   
        }
        
        //finds prime numbers and sets them to true
        for (int p = 2; p * p <= n; p++) {
            
            if (numbers[p] == true) {
                
                for (int i = p * p; i <= n; i+=p) {
                    
                    numbers[i] = false;
                }
            }
        }        
        
        //prints out the values set to true
        for (int i = 2; i < n; i++) {
           
            if (numbers[i] = true) {
                
                System.out.print(i + " ");
                line++;
            }
                //prints on new line after 20 values are printed
                if (line == 20) {
                    
                    System.out.println(" ");
                    line = 0;
                }
            }
        }
    }
