package ua.dp.hillel.java15.collections;

import java.util.*;

/**
 * Created by stephenvolf on 29/05/17.
 */
public class Lists implements Runnable {
    @Override
    public void run() {
        Random random = new Random();

        List<IntWrapper> list = new LinkedList<>();
        List<String> anotherList = new ArrayList<>();

        Integer value = random.nextInt();

        for (int i = 0; i < 5; i++) {
            IntWrapper element = new IntWrapper(value);
            list.add(element);
        }

        for (IntWrapper number : list) {
            number.print();
        }

        list.get(0).increment();

        for (IntWrapper number : list) {
            number.print();
        }

    }

    private static class IntWrapper{
        private Integer value;

        public IntWrapper(Integer value) {
            this.value = value;
        }

        public void print(){
            System.out.println(value);
        }

        public void increment(){
            ++value;
        }
    }
}
