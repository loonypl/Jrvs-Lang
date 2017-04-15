package amao.krzysek.lang.jrvs.collections.executors.expressions.integer;

import java.util.LinkedList;
import java.util.Random;

public class RandomBetween {

    public static Object run(LinkedList<Object> objs) {
        int from = Integer.parseInt((String) objs.get(0));
        int to = Integer.parseInt((String) objs.get(1));
        int random = new Random().nextInt((to - from) + 1) + from;
        return String.valueOf(random);
    }

}
