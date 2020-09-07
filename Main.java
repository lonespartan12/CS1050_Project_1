/*
Program name: Program #1: Numbers
Description: calculate the sum and the product of two numbers that are input by the user.
Author: Christian Mudd
Date: 07/09/2020
Version: 1.0
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // promp user
    System.out.println("Enter first integer number: ");
    int firstNumber = scan.nextInt();
    System.out.println("Enter second integer number: ");
    int secondNumber = scan.nextInt();

    // display users inputs and calculate output
    System.out.println("Your numbers are: " + firstNumber + " and " + secondNumber + ".");
    int sum = firstNumber + secondNumber;
    int product = firstNumber * secondNumber;
    // sum output
    System.out.println("Sum = " + sum);
    // product output
    System.out.println("Product = " + product);

    scan.close();
  }
}