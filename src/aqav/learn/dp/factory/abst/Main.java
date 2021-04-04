package aqav.learn.dp.factory.abst;

public class Main {

    public static void main(String[] args) {
        // Abstract factory easy to extend different product group

        AbstractFactory realWord = new RealWorldFactory();
        Vehicle vehicle0 = realWord.createVehicle();
        Food food0 = realWord.createFood();
        vehicle0.print();
        food0.print();

        AbstractFactory magicWorld = new MagicWorldFactory();
        Vehicle vehicle1 = magicWorld.createVehicle();
        Food food1 = magicWorld.createFood();
        vehicle1.print();
        food1.print();

    }
}
