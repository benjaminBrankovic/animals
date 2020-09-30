/**
 * created by Benjamin Brankovic
 * Date: 2020-09-29
 * Time: 20:23
 * Project: Animals
 * Copyright:
 */

/**
 * Enum representing animal food numeration.
 * Which animal has respective food-type.
 */

public enum AnimalFood {
    CAT("Kattfoder"),
    DOG("Hundfoder"),
    SNAKE("Ormpellets");

    private final String name;

    AnimalFood(String name) {
        this.name = name;
    }

    //Encapsulation
    String getName(){
        return name;
    }
}
