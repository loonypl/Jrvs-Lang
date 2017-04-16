package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;

public class CharAt {

    public static Object run(LinkedList<Object> objs) {
        int index = Integer.parseInt((String) objs.get(0));
        String string = (String) objs.get(1);
        return String.valueOf(string.charAt(index));
    }

}
