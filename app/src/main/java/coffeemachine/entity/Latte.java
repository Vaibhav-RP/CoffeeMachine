package coffeemachine.entity;

import java.util.ArrayList;
import java.util.List;

public class Latte implements Beverage {
    private Ingredient coffee;
    private Ingredient water;
    private Ingredient milk;

    public Latte() {
        coffee = new Ingredient("coffee", "gm", 20);
        water = new Ingredient("water", "ml", 50);
        milk = new Ingredient("milk", "ml", 100);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        ingredients.add(water);
        ingredients.add(milk);
        return ingredients;
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte");
    }
}
