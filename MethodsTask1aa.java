import java.util.Scanner;
public class MethodsTask1aa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please specify how many numbers should be entered: ");
        int total = reader.nextInt();
        int number = 0;

        if (total>0) {
            System.out.println("Please enter a total of " + total + " numbers");
            System.out.print("Enter first number: ");
            number = reader.nextInt();
                while (number>0) {
                    System.out.print("Enter next number: ");
                    number = reader.nextInt();
            }
        }
        else {
            System.out.println("You have entered incorrect parameters");
        }
    }
}


//        Napravite petlju koja ukoliko ima predefiniran neki broj u varijabli  “total”  koja je
//        deklarisana prije while-a i koji je razlicit od nula
//        While petlja ce traziti da unosite za svaki loop pozitivan broj.
//        Ukoliko unesete negativan broj while petlja zavrsava.

