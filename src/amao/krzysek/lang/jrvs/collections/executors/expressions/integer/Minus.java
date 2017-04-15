package amao.krzysek.lang.jrvs.collections.executors.expressions.integer;

import java.util.LinkedList;

public class Minus {

    public static Object run(LinkedList<Object> objs) {
        int arg1 = Integer.parseInt((String) objs.get(0));
        int arg2 = Integer.parseInt((String) objs.get(1));
        return String.valueOf(arg1 - arg2);
    }

}
