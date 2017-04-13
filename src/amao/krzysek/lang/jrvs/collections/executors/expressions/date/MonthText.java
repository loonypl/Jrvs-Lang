package amao.krzysek.lang.jrvs.collections.executors.expressions.date;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class MonthText {

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(ZonedDateTime.now().getMonth()).toLowerCase();
    }

}
