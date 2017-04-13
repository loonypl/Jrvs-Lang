package amao.krzysek.lang.jrvs.collections.executors.expressions.date;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Day {

    public static Object run(LinkedList<Object> objs) {
        return ZonedDateTime.now().getDayOfMonth();
    }

}
