package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;

public class CountAll {

    public static Object run(LinkedList<Object> objs) {
        String string = (String) objs.get(0);
        return string.length();
    }

}
