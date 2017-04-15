package amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar;

import java.util.LinkedList;
import java.util.Random;

public class DoubleRandom {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(new Random().nextDouble());
    }

}
