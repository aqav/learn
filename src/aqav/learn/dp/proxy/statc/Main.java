package aqav.learn.dp.proxy.statc;

public class Main {

    public static void main(String[] args) {
        new TankTimeProxy(new TankLogProxy(new Tank())).move();
    }
}
