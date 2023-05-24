package coffeemachine.service;

import coffeemachine.entity.Beverage;
import coffeemachine.entity.Cappuccino;
import coffeemachine.entity.Espresso;
import coffeemachine.entity.Latte;
import coffeemachine.entity.Tea;

public class  BeverageFactory {
    public Beverage createBeverage(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } 
        else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } 
        else if (type.equalsIgnoreCase("cappuccino")){
            return new Cappuccino();
        } 
        else if (type.equalsIgnoreCase("tea")) {
                return new Tea();
        } else {
                return null;
        }
    }

}
