package aqav.learn.dp.proxy.statc;

public class TankLogProxy implements Moveable {

    private Moveable moveable;

    public TankLogProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("Tank moving ...");
        moveable.move();
        System.out.println("Tank stop ...");
    }
}
