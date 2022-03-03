import java.util.Scanner;
public class MethodsTask1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Please enter any integer: ");
            number = reader.nextInt();
        }
        while (number!=-1000);
        if (number==-1000) {
            System.out.println();
            System.out.println("Exit number -1000 has been detected.");
        }
    }
}