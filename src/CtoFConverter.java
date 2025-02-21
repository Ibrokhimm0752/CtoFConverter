import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // Clear the buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        } while (!done);

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Equivalent temperature in Fahrenheit: %.2f°F\n", fahrenheit);

        in.close();
    }
}