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
  }
}