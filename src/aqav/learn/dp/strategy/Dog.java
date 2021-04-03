package aqav.learn.dp.strategy;

public class Dog {

    public int weight;
    public int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
