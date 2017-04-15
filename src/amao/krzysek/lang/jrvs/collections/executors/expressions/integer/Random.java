package amao.krzysek.lang.jrvs.collections.executors.expressions.integer;

import java.util.LinkedList;

public class Random {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(new java.util.Random().nextInt());
    }


}
