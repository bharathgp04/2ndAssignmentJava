import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        // create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // display the multiplication table for the entered number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        
        // close the Scanner object
        scanner.close();
    }

}