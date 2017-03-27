package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;

public class Get {

    public static Object run() {
        ZonedDateTime dateTime = ZonedDateTime.now();
        return dateTime.getDayOfMonth() + "." + dateTime.getMonthValue() + "." + dateTime.getYear();
    }

}
