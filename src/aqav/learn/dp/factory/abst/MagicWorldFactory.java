package aqav.learn.dp.factory.abst;

public class MagicWorldFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        // you can add some code before create
        return new Broom();
    }

    @Override
    public Food createFood() {
        // you can add some code before create
        return new Mushroom();
    }
}
