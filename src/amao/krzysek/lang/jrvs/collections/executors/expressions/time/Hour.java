package amao.krzysek.lang.jrvs.collections.executors.expressions.time;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Hour {

    public static Object run(LinkedList<Object> objs) {
        return ZonedDateTime.now().getHour();
    }

}
