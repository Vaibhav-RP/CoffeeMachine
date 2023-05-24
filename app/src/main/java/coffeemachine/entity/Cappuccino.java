package coffeemachine.entity;

import java.util.ArrayList;
import java.util.List;

public class Cappuccino implements Beverage {
    private Ingredient coffee;
    private Ingredient water;
    private Ingredient milk;
    private Ingredient foam;

    public Cappuccino() {
        coffee = new Ingredient("coffee", "gm", 20);
        water = new Ingredient("water", "ml", 50);
        milk = new Ingredient("milk", "ml", 100);
        foam = new Ingredient("foam", "ml", 50);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        ingredients.add(water);
        ingredients.add(milk);
        ingredients.add(foam);
        return ingredients;
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino");
    }
}
