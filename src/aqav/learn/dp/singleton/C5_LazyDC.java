package aqav.learn.dp.singleton;

public class C5_LazyDC {

    private static volatile C5_LazyDC INSTANCE;

    private C5_LazyDC(){}

    public static C5_LazyDC getInstance(){
        if(INSTANCE == null){
            synchronized (C5_LazyDC.class){
                if(INSTANCE == null){
                    INSTANCE = new C5_LazyDC();
                }
            }
        }
        return INSTANCE;
    }
}
