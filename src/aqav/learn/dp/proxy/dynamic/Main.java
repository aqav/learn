package aqav.learn.dp.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();

        Moveable moveable = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Moveable.class},
                new InvocationHandler() {
                    @Override
                    // method is the method that be proxied, which is Moveable.move
                    // args is the method arguments array
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("pre operate");
                        // If method is proxied, it's not necessary to call the method actually
                        method.invoke(tank, args); // call the proxy method, it's not necessary
                        System.out.println("after operate");
                        return null; // since Moveable.move return void
                    }
                }
        );

        moveable.move();
    }
}
