/**
 * created by Benjamin Brankovic
 * Date: 2020-09-27
 * Time: 18:13
 * Project: Animals
 * Copyright:
 */
public class Snake extends Animal {

    Snake(String name, int weight) {
        super(name, weight);
    }

    @Override
    public AnimalFood typeOfFood() {
        return AnimalFood.SNAKE;
    }

    @Override
    public int CalcFood() {
        return 20;
    }
}
