import java.text.DecimalFormat;

/**
 * created by Benjamin Brankovic
 * Date: 2020-09-27
 * Time: 17:33
 * Project: Animals
 * Copyright:
 */

/**
 * This Super-class represents an animal.
 * Implements interfaces ITypeOfFood and ICalcFood
 */
abstract class Animal implements ITypeOfFood, ICalcFood {

    private final String name;
    private final int weight;

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //Encapsulation
    public String getName() {
        return name;
    }
    //Encapsulation
    public int getWeight() {
        return weight;
    }


    /**
     * Method to print out any animal using polymorphism
     * @param animal to print out
     * @return Formatted animal String.
     */
    public String getAnimalProperties(Animal animal) {
        var df = new DecimalFormat("#,###.#");
        return String.format("Namn: %s\n" +
                        "Vikt: %skg\n" +
                        "Antal gram mat: %sg\n" +
                        "Typ av mat: %s", animal.getName(), animal.getWeight(),
                df.format(animal.CalcFood()), animal.typeOfFood().getName());
    }

}
