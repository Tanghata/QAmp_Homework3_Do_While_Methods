import java.util.Scanner;
public class MethodsTask1aaa {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean firstNumber = checkIfPositive(0);
     }

    static public boolean checkIfPositive (int number) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter an integer (must be a positive number): ");
        number = reader.nextInt();
        if (number>0) {
            checkIfPositive(0);
        }
        else if (number==0) {
            System.out.println("You have entered 0. We're not sure what to do with 0 :)");
        }
        else {
            System.out.println("You have entered negative number. Therefore, the loop has been terminated.");
        }
        return true;
    }
}
