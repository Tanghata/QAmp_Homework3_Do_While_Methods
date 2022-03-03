import java.util.Scanner;
public class MethodsTask1c {

    public static int numberToStartWith (int firstNumber) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please specify if you would like to enter the first number (Y/N): " );
        char response = reader.next().charAt(0);
        System.out.println();
        if (response == 'Y'|| response == 'y') {
            System.out.print("Please enter the first number: ");
            firstNumber = reader.nextInt();
        }
        else if (response == 'N'|| response == 'n') {
            firstNumber = 0;
        }
        else if ((response != 'Y') && (response != 'y') && (response != 'N') && (response != 'n')) {
            System.out.println("That is not a valid response");
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstInteger = numberToStartWith(0);
        System.out.print("Please enter the second number: ");
        int secondInteger = reader.nextInt();
        System.out.println();
        System.out.println("The sum of " + firstInteger + " and " + secondInteger + " is " + Integer.sum(firstInteger, secondInteger));
    }
}