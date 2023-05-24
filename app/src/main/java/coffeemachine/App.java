/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package coffeemachine;

import java.util.Scanner;

import coffeemachine.service.BeverageFactory;
import coffeemachine.service.Controller;

public class App {
   
    public static void main(String[] args) {
        BeverageFactory beverageFactory = new BeverageFactory();
        Controller controller = new Controller(beverageFactory);
        Scanner scanner = new Scanner(System.in);
        String beverageType;

        do {
            System.out.println("\nWhat would you like? Cappuccino, Espresso, Latte, or Tea?\n");
            beverageType = scanner.nextLine();
            controller.serveBeverage(beverageType.toLowerCase());

            System.out.println("\nDo you want to order another beverage? (yes/no)\n");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        scanner.close();

    }
}
