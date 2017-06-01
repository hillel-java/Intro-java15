package ua.dp.hillel.java15.collections;

import java.util.*;

/**
 * Created by stephenvolf on 29/05/17.
 */
public class Maps implements Runnable {
    @Override
    public void run() {
        Map<String, Integer> heights = new HashMap<>();
        heights.put("Vasya", 182);
        heights.put("Masha", 203);
        heights.put("Masha", 165);

        int i = 0;

        for (Map.Entry<String, Integer> entry : heights.entrySet()) {
            System.out.println("name: " + entry.getKey() + "; height: " + entry.getValue());
        }

        Set<Map.Entry<String, Integer>> entries = heights.entrySet();
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(entries);

        while (i < heights.size()) {

            Map.Entry<String, Integer> entry = entryList.get(i);
            System.out.println("name: " + entry.getKey() + "; height: " + entry.getValue());
            i++;
        }
    }
}
