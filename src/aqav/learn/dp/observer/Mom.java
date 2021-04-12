package aqav.learn.dp.observer;

public class Mom implements ChildObserver {

    @Override
    public void whenChildWakeUp(WakeUpEvent wakeUp) {
        // do something
        System.out.println("hug child...");
    }
}
