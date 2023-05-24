package coffeemachine.service;
import java.util.List;

import coffeemachine.entity.Beverage;
import coffeemachine.entity.Ingredient;

public class Controller {
    private BeverageFactory beverageFactory;

    public Controller(BeverageFactory beverageFactory) {
        this.beverageFactory = beverageFactory;
    }

    public void serveBeverage(String type) {
        Beverage beverage = beverageFactory.createBeverage(type);
        if (beverage != null) {
            List<Ingredient> ingredients = beverage.getIngredients();
            System.out.println("Preparing " + type + ":");
            for (Ingredient ingredient : ingredients) {
                System.out.println("- " + ingredient.getName() + ": " + ingredient.getValue() + " " + ingredient.getUnit());
            }
            beverage.serve();
        } else {
            System.out.println("Invalid beverage type!");
        }
    }
}
