package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;

public class ReplaceAll {

    public static Object run(LinkedList<Object> objs) {
        String from = (String) objs.get(0);
        String to = (String) objs.get(1);
        String string = (String) objs.get(2);
        return String.valueOf(string.replaceAll(from, to));
    }

}
