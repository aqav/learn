package aqav.learn.dp.observer;

import java.util.Date;

public class WakeUpEvent extends Event<Child> {

    private Date timestamp;
    private String location;
    private Child source;

    public WakeUpEvent(Date timestamp, String location) {
        this.timestamp = timestamp;
        this.location = location;
    }

    @Override
    public Child getSource() {
        return source;
    }
}
