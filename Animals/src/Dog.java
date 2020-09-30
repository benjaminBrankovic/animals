/**
 * created by Benjamin Brankovic
 * Date: 2020-09-27
 * Time: 17:41
 * Project: Animals
 * Copyright:
 */
public class Dog extends Animal {

    Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public AnimalFood typeOfFood() {
        return AnimalFood.DOG;
    }

    @Override
    public int CalcFood() {
        return (getWeight() * 1000) / 100;
    }
}
