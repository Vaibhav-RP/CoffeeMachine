package coffeemachine;

import java.util.List;

interface BeverageInterface {
    List<Ingredient> getIngredients();
    void serve(String beverage);
    void makeBeverage(String choice);

}