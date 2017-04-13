package amao.krzysek.lang.jrvs.collections.executors.expressions.time;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Get {

    public static Object run(LinkedList<Object> objs) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        if (dateTime.getMinute() == 0 || dateTime.getMinute() == 1 || dateTime.getMinute() == 2 || dateTime.getMinute() == 3 || dateTime.getMinute() == 4 || dateTime.getMinute() == 5 || dateTime.getMinute() == 6 || dateTime.getMinute() == 7 || dateTime.getMinute() == 8 || dateTime.getMinute() == 9)
            return dateTime.getHour() + ":0" + dateTime.getMinute();
        else return dateTime.getHour() + ":" + dateTime.getMinute();
    }

}
