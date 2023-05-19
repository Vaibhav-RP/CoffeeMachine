package coffeemachine;

import java.util.ArrayList;
import java.util.List;

class MyBeverage implements BeverageInterface {
    private Ingredient sugar;
    private Ingredient water;
    private Ingredient coffee;
    private Ingredient milk;
    private Ingredient teaLeaves;

    public MyBeverage() {
        sugar = new Ingredient("sugar", "gm", 10);
        water = new Ingredient("water", "ml", 200);
        coffee = new Ingredient("coffee", "gm", 20);
        milk = new Ingredient("milk", "ml", 50);
        teaLeaves = new Ingredient("tea leaves", "gm", 5);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(water);
        ingredients.add(sugar);
        ingredients.add(coffee);
        ingredients.add(milk);
        ingredients.add(teaLeaves);
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("\n\t -> Yehhhh !, Serving beverage: " + beverage);
    }

    public void makeBeverage(String choice) {
        switch (choice) {
            case "coffee":
                makeCoffee();
                break;
            case "tea":
                makeTea();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private void makeCoffee() {
        boilWater(water);
        mixCoffee(coffee);
        addSugar(sugar);
        heatMilk(milk);
    }

    private void makeTea() {
        boilWater(water);
        addTeaLeaves(teaLeaves);
        addSugar(sugar);
    }

    private void boilWater(Ingredient water) {
        System.out.println("\t -> Boiling water");
    }

    private void mixCoffee(Ingredient coffee) {
        System.out.println("\t -> Mixing coffee");
    }

    private void addSugar(Ingredient sugar) {
        System.out.println("\t -> Adding sugar");
    }

    private void heatMilk(Ingredient milk) {
        System.out.println("\t -> Heating milk");
    }

    private void addTeaLeaves(Ingredient teaLeaves) {
        System.out.println("\t -> Adding tea leaves");
    }
}
