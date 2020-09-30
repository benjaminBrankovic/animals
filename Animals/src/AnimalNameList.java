import java.util.ArrayList;
import java.util.List;

/**
 * created by Benjamin Brankovic
 * Date: 2020-09-29
 * Time: 20:45
 * Project: Animals
 * Copyright:
 */

/**
 * In memory Mock database.
 */
public class AnimalNameList {

    //Mock Database
    private static List<Animal> animals = new ArrayList<>();

    public static void init() {
        animals.add(new Dog("Dogge", 10));
        animals.add(new Snake("Hypno", 1));
        animals.add(new Cat("Ove", 3));
        animals.add(new Dog("Sixten", 5));
        animals.add(new Cat("Venus", 5));
    }

    /**
     * Get animal that matches name
     * @param name name of the animal you're trying to find
     * @return animal that matches name else null
     */
    public static Animal getByName(String name) {
        for(var animal : animals){
            if(animal.getName().equalsIgnoreCase(name))
                return animal;
        }
        return null;

        //Diffrent way of finding the animal
        /*return animals.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findAny()
                .orElse(null);*/
    }
}
