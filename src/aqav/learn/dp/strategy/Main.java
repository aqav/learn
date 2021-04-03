package aqav.learn.dp.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(3, 3),
                new Dog(5, 5),
                new Dog(1, 1)
        };

        // different compare strategy, different comparator
        Sorter.sort(dogs, (d0, d1) -> {
            if (d0.weight < d1.weight) {
                return -1;
            } else if (d0.weight > d1.weight) {
                return 1;
            }
            return 0;
        });
//        Sorter.sort(dogs, (d0, d1) -> {
//            if (d0.height < d1.height) {
//                return -1;
//            } else if (d0.height > d1.height) {
//                return 1;
//            }
//            return 0;
//        });
        System.out.println(Arrays.toString(dogs));
    }
}
