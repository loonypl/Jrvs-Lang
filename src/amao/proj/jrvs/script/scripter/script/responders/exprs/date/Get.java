package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Get {

    public static Object run(LinkedList<Object> objs) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        return dateTime.getDayOfMonth() + "." + dateTime.getMonthValue() + "." + dateTime.getYear();
    }

}
