package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Day {

    public static Object run(LinkedList<Object> objs) {
        return ZonedDateTime.now().getDayOfMonth();
    }

}
