package aqav.learn.dp.proxy.statc;

public class TankTimeProxy implements Moveable {

    private Moveable moveable;

    public TankTimeProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();

        moveable.move();

        long end = System.currentTimeMillis();
        System.out.println("Tank have moving " + (end - start) / 1000 + " second");
    }


}
