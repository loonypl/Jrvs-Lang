package amao.proj.jrvs.script.scripter.script.responders.exprs.time;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Hour {

    public static Object run(LinkedList<Object> objs) {
        return ZonedDateTime.now().getHour();
    }

}
