package aqav.learn.dp.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Child {

    // also can use dp: chain of responsibility,
    // example: child keep a observer chain rather than a observer list
    private List<ChildObserver> observers = new ArrayList<>();

    public Child() {
        observers.add(new Dad());
        observers.add(new Mom());
    }

    public void wakeUp() {
        WakeUpEvent wakeUp = new WakeUpEvent(new Date(), "bed");

        for (ChildObserver observer : observers) {
            observer.whenChildWakeUp(wakeUp);
        }
    }
}
