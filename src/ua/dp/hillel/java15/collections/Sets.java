package ua.dp.hillel.java15.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stephenvolf on 29/05/17.
 */
public class Sets implements Runnable {
    @Override
    public void run() {
        Set<String> someSet = new HashSet<>();
        someSet.add("hello");
        someSet.add("hello");
        someSet.add("world");
        someSet.add("world");
        someSet.add("world");

        for(String str : someSet){
            System.out.println(str);
        }
    }
}
