package aqav.learn.dp.singleton;

public class C1_Eager {

    // not lazy
    public static final C1_Eager INSTANCE = new C1_Eager();

    private C1_Eager(){}
}
