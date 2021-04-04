package aqav.learn.dp.factory.method;

public class Main {

    public static void main(String[] args) {
        // factory method easy to extend different product
        // different factory produce different product

        Car car = new CarFactory().createCar();
        Plane plane = new PlaneFactory().createPlane();
    }
}
