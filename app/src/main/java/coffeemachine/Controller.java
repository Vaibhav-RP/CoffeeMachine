package coffeemachine;
import java.util.List;
import java.util.Scanner;

class Controller {
    private BeverageInterface beverage;

    public Controller(BeverageInterface beverage) {
        this.beverage = beverage;
    }

    public void makeBeverage() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            List<Ingredient> ingredients = beverage.getIngredients();
            StringBuilder menu = new StringBuilder();
            menu.append("\nAvailable options:\n");
            menu.append("1. Espresso\n");
            menu.append("2. Latte\n");
            menu.append("3. Cappuccino\n");
            menu.append("4. Tea\n");
            System.out.println(menu.toString());

            System.out.print("\nEnter your choice: ");
            int option = scanner.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    beverage.makeBeverage("coffee");
                    beverage.serve("Espresso");
                    break;
                case 2:
                    beverage.makeBeverage("coffee");
                    beverage.serve("Latte");
                    break;
                case 3:
                    beverage.makeBeverage("coffee");
                    beverage.serve("Cappuccino");
                    break;
                case 4:
                    beverage.makeBeverage("tea");
                    beverage.serve("Tea");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.print("\nDo you want to taste again? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}