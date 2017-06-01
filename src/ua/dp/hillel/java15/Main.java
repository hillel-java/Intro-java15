package ua.dp.hillel.java15;

import ua.dp.hillel.java15.collections.Maps;
import ua.dp.hillel.java15.collections.Sets;
import ua.dp.hillel.java15.interfaces.Printable;

/**
 * Created by stephenvolf on 25/05/17.
 */
public class Main {

    public static void main(String[] args){
//        Main m = new Main();
//        m.run(new Message("Hello"));
//        m.run(new AnotherMessage());
//    new Lists().run();
    new Maps().run();
    }


    public void run(Printable p){
        p.print();
    }

}
