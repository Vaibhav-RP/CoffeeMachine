package coffeemachine.entity;

import java.util.ArrayList;
import java.util.List;

public class Espresso implements Beverage {
    private Ingredient coffee;
    private Ingredient water;

    public Espresso() {
        coffee = new Ingredient("coffee", "gm", 20);
        water = new Ingredient("water", "ml", 50);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        ingredients.add(water);
        return ingredients;
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso");
    }
}