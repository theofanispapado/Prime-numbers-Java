/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author MrFaneas
 */
public class primeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num ;
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
               
    boolean isPrimeNumber = false;
    for (int i = 2; i <= num/2; ++i) {
    
      if (num % i == 0) {
        isPrimeNumber = true;
        break;
      }
    }

    if (!isPrimeNumber)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
    
    
}
