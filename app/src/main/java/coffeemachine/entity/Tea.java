package coffeemachine.entity;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Beverage {
    private Ingredient teaLeaves;
    private Ingredient water;

    public Tea() {
        teaLeaves = new Ingredient("tea leaves", "gm", 5);
        water = new Ingredient("water", "ml", 150);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(teaLeaves);
        ingredients.add(water);
        return ingredients;
    }

    @Override
    public void serve() {
        System.out.println("Serving Tea");
    }
}