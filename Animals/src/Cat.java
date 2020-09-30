/**
 * created by Benjamin Brankovic
 * Date: 2020-09-27
 * Time: 18:10
 * Project: Animals
 * Copyright:
 */
public class Cat extends Animal {

    Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public AnimalFood typeOfFood() {
        return AnimalFood.CAT;
    }

    @Override
    public int CalcFood() {
        return (getWeight() * 1000) / 150;
    }
}
