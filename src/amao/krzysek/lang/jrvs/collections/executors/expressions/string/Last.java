package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;

public class Last {

    public static Object run(LinkedList<Object> objs) {
        String string = (String) objs.get(0);
        return String.valueOf(string.charAt(string.length()-1));
    }

}
