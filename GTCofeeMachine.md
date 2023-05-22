
# GT Beverage Vending Machine

Hey there, we, the ingenious developers of GoalTeller, have an exciting dilemma! our remarkable coffee vending machine, crafted by the one and only Nandu, Our first developer, exclusively serves his personal coffee preferences. Alas, not all of us share his refined taste.

But fear not! Our brilliant minds have brought up a plan to revolutionize our beloved coffee machine into an extraordinary beverage vending machine! It shall cater not only to the coffee lovers among us but also to the tea devotees, especially our beloved Product Manager Rahul, who is a tea lover extraordinaire.

Now, we're knee-deep in business application development and find ourselves with scarce time for tinkering. That's where we turn to you to help us breathe new life into our cherished coffee machine.

Could you work your enchantments and transform the code for our coffee machine into a magnificent beverage vending machine that serves an array of delightful brews? Here are the types of coffee and tea we would love for our machine to offer:



* Espresso: A bold and intense coffee experience.
* Latte: A creamy delight with the perfect balance of coffee and milk.
* Cappuccino: A frothy masterpiece that combines equal parts of espresso, steamed milk, and milk foam.
* Tea: A soothing brew that warms the heart and invigorates the soul.

Below is the original code of our coffee machine. We trust your wizardry to modify it into a marvelous beverage machine:


```Java
import java.util.ArrayList;
import java.util.List;

interface CoffeeInterface {
    List<Ingredient> getIngredients();
    void serve(String coffee);
}

class MyCoffee implements CoffeeInterface {
    private Ingredient sugar;̀
    private Ingredient water;
    private Ingredient coffee;
    private Ingredient milk;

    public MyCoffee() {
        sugar = new Ingredient("sugar", "gm", 10);
        water = new Ingredient("water", "ml", 200);
        coffee = new Ingredient("coffee", "gm", 20);
        milk = new Ingredient("milk", "ml", 50);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(water);
        ingredients.add(sugar);
        ingredients.add(coffee);
        ingredients.add(milk);
        return ingredients;
    }

    @Override
    public void serve(String coffee) {
        System.out.println("Serving coffee: " + coffee);
    }

    public MyCoffee makeCoffee() {
        boilWater(water);
        heatMilk(milk);
        mixCoffee(coffee);
        addSugar(sugar);
        return this;
    }

    private void boilWater(Ingredient water) {
        System.out.println("Boiling water");
    }

    private void heatMilk(Ingredient milk) {
        System.out.println("Heating milk");
    }

    private void mixCoffee(Ingredient coffee) {
        System.out.println("Mixing coffee");
    }

    private void addSugar(Ingredient sugar) {
        System.out.println("Adding sugar");
    }
}

class Ingredient {
    private String name;
    private String unit;
    private double value;

    public Ingredient(String name, String unit, double value) {
        this.name = name;
        this.unit = unit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}

class Controller {
    private CoffeeInterface coffee;

    public Controller(CoffeeInterface coffee) {
        this.coffee = coffee;
    }

    public void makeCoffee() {
        MyCoffee myCoffee = (MyCoffee) coffee.makeCoffee();
        coffee.serve(myCoffee.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeInterface myCoffee = new MyCoffee();
        Controller controller = new Controller(myCoffee);
        controller.makeCoffee();
    }
}

```

### Notes:



* The assignment will be judged based on code craftsmanship, readability, and maintainability.
* The provided code snippet may not be fully functional; please use it as a reference.
* You are free to make assumptions regarding the beverage ingredients. We are primarily interested in assessing your coding skills.
* You can choose any programming language and design methodology, but be prepared to explain your design decisions.


### Mode of Submission:

* Share a link to the github repository where you have pushed your solution. You may be asked to explain your solution.

	
