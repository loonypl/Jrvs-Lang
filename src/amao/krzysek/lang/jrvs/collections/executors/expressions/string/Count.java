package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;

public class Count {

    public static Object run(LinkedList<Object> objs) {
        String string = (String) objs.get(0);
        String count = (String) objs.get(1);
        int counter = 0;
        for (int i = 0; i < string.length(); i++) if (String.valueOf(string.charAt(i)).equalsIgnoreCase(count)) counter++;
        return String.valueOf(counter);
    }

}
