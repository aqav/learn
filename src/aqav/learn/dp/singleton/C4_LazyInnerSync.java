package aqav.learn.dp.singleton;

public class C4_LazyInnerSync {

    private static C4_LazyInnerSync INSTANCE;

    private C4_LazyInnerSync() {
    }

    public static C4_LazyInnerSync getInstance() {
        if (INSTANCE == null) {
            // multiple thread problem
            synchronized (C4_LazyInnerSync.class) {
                INSTANCE = new C4_LazyInnerSync();
            }
        }
        return INSTANCE;
    }

}
