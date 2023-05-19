package coffeemachine;

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
