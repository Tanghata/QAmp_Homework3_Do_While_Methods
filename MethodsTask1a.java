import java.util.Scanner;
public class MethodsTask1a {

    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static int difference(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    public static int product(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    public static int quotient(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the first integer: ");
        int numberOne = reader.nextInt();
        System.out.print("Please enter the second integer: ");
        int numberTwo = reader.nextInt();
        System.out.println();
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum(numberOne, numberTwo));
        System.out.println("The difference of " + numberOne + " and " + numberTwo + " is " + difference(numberOne, numberTwo));
        System.out.println("The product of " + numberOne + " and " + numberTwo + " is " + product(numberOne, numberTwo));

        if (numberTwo==0){
            try {
                int result =numberOne/numberTwo;
            }
            catch (ArithmeticException e) {
                System.out.println ("You should not divide a number by zero");
                }
            }
        else if (numberTwo!=0 && numberOne%numberTwo==0) {
            System.out.println("Number " + numberOne + " divided by " + numberTwo + " equals " + quotient(numberOne, numberTwo));
        }
        else if (numberTwo!=0 && numberOne%numberTwo!=0) {
            System.out.println("Number " + numberOne + " is not divisible by " + numberTwo);
        }
    }
}
