package coffeemachine.entity;

import java.util.List;

public interface Beverage {
    List<Ingredient> getIngredients();
    void serve();
}
