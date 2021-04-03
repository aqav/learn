package aqav.learn.dp.singleton;

public class C6_LazyStaticInnerClass {

    private C6_LazyStaticInnerClass(){}

    private static class Holder {
        private static final C6_LazyStaticInnerClass INSTANCE =
                new C6_LazyStaticInnerClass();
    }

    public static C6_LazyStaticInnerClass getInstance(){
        return Holder.INSTANCE;
    }
}
