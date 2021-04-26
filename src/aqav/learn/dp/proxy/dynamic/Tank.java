package aqav.learn.dp.proxy.dynamic;


import java.util.Random;

public class Tank implements Moveable {

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
