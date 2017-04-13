package amao.krzysek.lang.jrvs.collections.executors.expressions.time;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Minute {

    public static Object run(LinkedList<Object> objs) {
        return ZonedDateTime.now().getMinute();
    }

}
