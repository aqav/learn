package aqav.learn.dp.singleton;

public class C3_LazySync {

    private static C3_LazySync INSTANCE;

    private C3_LazySync() {
    }

    public static synchronized C3_LazySync getInstance() {
        if (INSTANCE == null) {
            // Inefficient
            INSTANCE = new C3_LazySync();
        }
        return INSTANCE;
    }
}
