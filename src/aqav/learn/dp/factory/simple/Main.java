package aqav.learn.dp.factory.simple;

public class Main {

    public static void main(String[] args) {
        // different factory produce different product
        Car car = CarFactory.produce();
        Plane plane = PlaneFactory.produce();
    }
}
