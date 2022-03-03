import java.util.Scanner;
import java.lang.ArithmeticException;

public class MethodsTask1d_e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please specify which arithmetic operation would you like to use: '*','/','+' or '-':?");
        char arithmeticOperator = reader.next().charAt(0);
        System.out.print("Please enter the first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = reader.nextInt();

        if(arithmeticOperator=='+') {
            System.out.println();
            System.out.println("The sum of two entered numbers is " + sum (firstNumber, secondNumber));
        }
        else if(arithmeticOperator=='-') {
            System.out.println();
            System.out.println("The difference of two entered numbers is " + difference (firstNumber, secondNumber));
        }
        else if(arithmeticOperator=='*') {
            System.out.println();
            System.out.println("The product of two entered numbers is " + product (firstNumber, secondNumber));
        }
        else if((secondNumber==0) && (arithmeticOperator=='/')) {
            try {
                int result =firstNumber/secondNumber;
                            }
            catch (ArithmeticException e) {
                System.out.println();
                System.out.println ("You should not divide a number by zero");
                }
            }
            else if((firstNumber%secondNumber==0) && (arithmeticOperator=='/')) {
            System.out.println();
            System.out.println("The quotient of two entered numbers is " + quotient (firstNumber, secondNumber));
        }
            else if((firstNumber%secondNumber!=0) && (arithmeticOperator=='/')) {
            System.out.println();
            System.out.println("Number " + firstNumber + " is not divisible by " + secondNumber);
            }
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