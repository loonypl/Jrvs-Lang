package amao.krzysek.lang.jrvs.collections.executors.expressions.java;

import java.util.LinkedList;

public class Vendor {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(System.getProperty("java.vendor"));
    }

}
