package aqav.learn.dp.observer;

public class Dad implements ChildObserver {

    @Override
    public void whenChildWakeUp(WakeUpEvent wakeUp) {
        // do something
        System.out.println("feed child...");
    }
}
