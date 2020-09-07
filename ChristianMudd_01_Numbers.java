/*
Program name: Program #1: Numbers
Description: Calculate the sum and the product of two integer numbers that are input by the user.
Author: Christian Mudd
Date: 07/09/2020
Version: 1.0
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Declaration area
    Scanner scan = new Scanner(System.in);
    int firstNumber = 0;
    int secondNumber = 0;
    int sum = 0;
    int product = 0;

    // prompt user for input
    System.out.println("Enter first integer number: ");
    firstNumber = scan.nextInt();
    System.out.println("Enter second integer number: ");
    secondNumber = scan.nextInt();

    // display users inputs and calculate output
    System.out.println("Your numbers are: " + firstNumber + " and " + secondNumber + ".");
    sum = firstNumber + secondNumber;
    product = firstNumber * secondNumber;

    // sum output
    System.out.println("Sum = " + sum);
    // product output
    System.out.println("Product = " + product);

    // close the scanner
    scan.close();
  }
}