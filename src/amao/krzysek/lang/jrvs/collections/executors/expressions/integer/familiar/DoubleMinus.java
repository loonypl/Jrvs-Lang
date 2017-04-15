package amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar;

import java.util.LinkedList;

public class DoubleMinus {

    public static Object run(LinkedList<Object> objs) {
        double arg1 = Double.parseDouble((String) objs.get(0));
        double arg2 = Double.parseDouble((String) objs.get(1));
        return String.valueOf(arg1 - arg2);
    }

}
