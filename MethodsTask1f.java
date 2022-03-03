import java.util.Scanner;
import java.lang.ArithmeticException;

public class MethodsTask1f {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = reader.nextInt();
        char arithmeticOperator;

        do {
            System.out.println("Please specify which arithmetic operation would you like to use: '*','/','+','-', or '=':?");
            arithmeticOperator = reader.next().charAt(0);
            if (arithmeticOperator == '=') {
                System.out.println("Calculator result is: " + firstNumber);
                break;
            }
            System.out.print("Enter the next number: ");
            int secondNumber = reader.nextInt();
            if (arithmeticOperator == '+') {
                firstNumber = sum(firstNumber, secondNumber);
            } else if (arithmeticOperator == '-') {
                firstNumber = difference(firstNumber, secondNumber);
            } else if (arithmeticOperator == '*') {
                firstNumber = product(firstNumber, secondNumber);
            } else if ((secondNumber == 0) && (arithmeticOperator == '/')) {
                try {
                    int result = firstNumber/secondNumber;
                } catch (ArithmeticException e) {
                    System.out.println("You should not divide a number by zero");
                }
                break;
            } else if ((firstNumber % secondNumber == 0) && (arithmeticOperator == '/')) {
                firstNumber = quotient(firstNumber, secondNumber);
            } else if ((firstNumber % secondNumber != 0) && (arithmeticOperator == '/')) {
                System.out.println("Number " + firstNumber + " is not divisible by " + secondNumber);
            }
        }
            while (arithmeticOperator!= '=');
    }

    public static int sum(int numberOne, int numberTwo) {
        return numberOne+numberTwo;
    }
    public static int difference(int numberOne, int numberTwo) {
        return numberOne-numberTwo;
    }
    public static int product(int numberOne, int numberTwo) {
        return numberOne*numberTwo;
    }
    public static int quotient(int numberOne, int numberTwo) {
        return numberOne/numberTwo;
    }
}