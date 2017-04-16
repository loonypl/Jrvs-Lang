package amao.krzysek.lang.jrvs.collections.executors.expressions.system;

import java.util.LinkedList;

public class Version {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(System.getProperty("os.version"));
    }

}
