package aqav.learn.dp.factory.abst;

public class RealWorldFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        // you can add some code before create
        return new Car();
    }

    @Override
    public Food createFood() {
        // you can add some code before create
        return new Bread();
    }
}
