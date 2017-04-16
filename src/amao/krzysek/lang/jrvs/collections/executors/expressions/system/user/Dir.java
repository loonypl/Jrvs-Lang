package amao.krzysek.lang.jrvs.collections.executors.expressions.system.user;

import java.util.LinkedList;

public class Dir {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(System.getProperty("user.dir"));
    }

}
