package aqav.learn.dp.singleton;

public class C2_Lazy {

    private static C2_Lazy INSTANCE;

    private C2_Lazy() {
    }

    public static C2_Lazy getInstance() {
        if (INSTANCE == null) {
            // multiple thread problem
            INSTANCE = new C2_Lazy();
        }
        return INSTANCE;
    }
}
